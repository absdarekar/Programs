import FreeCAD;
import Draft;
import Part;
import math;
import numpy;


doc=FreeCAD.newDocument("Bevel Gear");


def calculateRange(radiusRatio):
    PRECISION=0.0000001;
    xMean=0;
    xUpper=1;
    xLower=0;
    if((evalInv(radiusRatio,xUpper)*evalInv(radiusRatio,xLower))<0):
        xMean=(xUpper+xLower)/2;
        while(abs(evalInv(radiusRatio,xMean))>=PRECISION):
            xMean=(xUpper+xLower)/2;
            if ((evalInv(radiusRatio,xLower)*evalInv(radiusRatio,xMean))<=0):
                xUpper=xMean;
            else:
                xLower=xMean;
    return xMean;


def evalInv(radiusRatio,x):
    return eval("radiusRatio-math.cos(x)-x*math.sin(x)");

# bottom profile
MODULE=4;
TEETH=18;
PRESSURE_ANGLE=20*math.pi/180;


ORIGIN=FreeCAD.Vector(0,0,0);
ZAXIS=FreeCAD.Vector(0,0,1);
COPY=True;
CLOSED=True;
OPEN=False;
FACE=True;
WIRE_FRAME=False;
PLACEMENT=None
DELETE=True;
PRECISION=0.001;
baseRadius=MODULE*TEETH*math.cos(PRESSURE_ANGLE)/2;
addendumRadius=(MODULE*TEETH+2*MODULE)/2;
dedendumRadius=(MODULE*TEETH-2.5*MODULE)/2;
clearance=0.5*MODULE; # 20 degree full depth involute profile
filletRadius=0.25*MODULE # should not exceed clearance
angularSeperation=math.pi/(2*TEETH)-(math.tan(PRESSURE_ANGLE)-PRESSURE_ANGLE);
ratioAddendum=addendumRadius/baseRadius;
ratioDedendum=dedendumRadius/baseRadius;
angle=360/TEETH;


t=numpy.arange(calculateRange(ratioDedendum),calculateRange(ratioAddendum),PRECISION);
xInvLeft=baseRadius*(numpy.cos(-t-angularSeperation)-t*numpy.sin(-t-angularSeperation));
yInvLeft=baseRadius*(numpy.sin(-t-angularSeperation)+t*numpy.cos(-t-angularSeperation));
xInvRight=baseRadius*(numpy.cos(t+angularSeperation)+t*numpy.sin(t+angularSeperation));
yInvRight=baseRadius*(numpy.sin(t+angularSeperation)-t*numpy.cos(t+angularSeperation));


InvLeftVector=[];
InvRightVector=[];
for i in range(len(t)):
    InvLeftVector.append(FreeCAD.Vector(xInvLeft[i],yInvLeft[i],0));
    InvRightVector.append(FreeCAD.Vector(xInvRight[i],yInvRight[i],0));


addendumCirle=Draft.makeCircle(addendumRadius);
InvLeft=Draft.makeBSpline(Part.makePolygon(InvLeftVector),OPEN,WIRE_FRAME);
InvRight=Draft.makeBSpline(Part.makePolygon(InvRightVector),OPEN,WIRE_FRAME);
clearanceLeftX=FreeCAD.Vector(xInvLeft[0]-clearance+filletRadius,yInvLeft[0],0);
clearanceRightX=FreeCAD.Vector(xInvRight[0]-clearance+filletRadius,yInvRight[0],0);
lineLeft=Draft.makeLine(InvLeftVector[0],clearanceLeftX);
lineRight=Draft.makeLine(InvRightVector[0],clearanceRightX);
clearanceLeftY=FreeCAD.Vector(xInvLeft[0]-clearance,yInvLeft[0]+filletRadius,0);
clearanceRightY=FreeCAD.Vector(xInvRight[0]-clearance,yInvRight[0]-filletRadius,0);
lineClearance=Draft.makeLine(clearanceLeftY,clearanceRightY);
filletLeftCenter=FreeCAD.Placement();
filletRightCenter=FreeCAD.Placement();
filletLeftCenter.move(FreeCAD.Vector(xInvLeft[0]-clearance+filletRadius,\
                        yInvLeft[0]+filletRadius,0));
filletRightCenter.move(FreeCAD.Vector(xInvRight[0]-clearance+filletRadius,\
                        yInvRight[0]-filletRadius,0));
startangle=180;
endangle=270;
filletLeft=Draft.makeCircle(filletRadius,filletLeftCenter,WIRE_FRAME,startangle,endangle);
startangle=90;
endangle=180;
filletRight=Draft.makeCircle(filletRadius,filletRightCenter,WIRE_FRAME,startangle,endangle);
radius=math.sqrt(xInvLeft[len(xInvLeft)-1]**2+yInvLeft[len(xInvLeft)-1]**2);
arcAngle=math.atan(yInvLeft[len(xInvLeft)-1]/xInvLeft[len(xInvLeft)-1])*180/math.pi;
startangle=arcAngle;
endangle=-arcAngle;
arc=Draft.makeCircle(radius,PLACEMENT,WIRE_FRAME,startangle,endangle);
cutWire, deletedFeatures=Draft.upgrade([arc,lineRight,lineLeft,lineClearance,\
                                        InvRight,InvLeft,filletRight,filletLeft],DELETE);
cutFace, deletedFeatures=Draft.upgrade(cutWire,DELETE);
cutFaces=[]
cutFaces.append(cutFace[0]);
while(angle<360):
    cutFaces.append(Draft.rotate(cutFaces[0],angle,ORIGIN,ZAXIS,COPY));
    angle+=360/TEETH;
profile=addendumCirle;
for i in range(len(cutFaces)):
    profile=Draft.cut(profile,cutFaces[i]);
################################################################################
profileBottom=profile;
################################################################################


# top profile
################################################################################
GEAR_RATIO=1.25;
faceWidth=20;
pinionPitchAngle=math.atan(GEAR_RATIO);
gearPitchAngle=math.atan(1/GEAR_RATIO);
pitchAngle=pinionPitchAngle; # modelling the pinion of bevel gear pair
# pitchAngle=gearPitchAngle; # modelling the gear of bevel gear pair
MODULE_BOTTOM=MODULE;
MODULE=MODULE-((2*faceWidth*math.sin(pitchAngle))/TEETH);
height=math.sqrt((faceWidth**2-(MODULE_BOTTOM*TEETH/2-MODULE*TEETH/2)**2));
################################################################################
baseRadius=MODULE*TEETH*math.cos(PRESSURE_ANGLE)/2;
addendumRadius=(MODULE*TEETH+2*MODULE)/2;
dedendumRadius=(MODULE*TEETH-2.5*MODULE)/2;
clearance=0.5*MODULE; # 20 degree full depth involute profile
filletRadius=0.25*MODULE # should not exceed clearance
angularSeperation=math.pi/(2*TEETH)-(math.tan(PRESSURE_ANGLE)-PRESSURE_ANGLE);
ratioAddendum=addendumRadius/baseRadius;
ratioDedendum=dedendumRadius/baseRadius;
angle=360/TEETH;


t=numpy.arange(calculateRange(ratioDedendum),calculateRange(ratioAddendum),PRECISION);
xInvLeft=baseRadius*(numpy.cos(-t-angularSeperation)-t*numpy.sin(-t-angularSeperation));
yInvLeft=baseRadius*(numpy.sin(-t-angularSeperation)+t*numpy.cos(-t-angularSeperation));
xInvRight=baseRadius*(numpy.cos(t+angularSeperation)+t*numpy.sin(t+angularSeperation));
yInvRight=baseRadius*(numpy.sin(t+angularSeperation)-t*numpy.cos(t+angularSeperation));


InvLeftVector=[];
InvRightVector=[];
for i in range(len(t)):
    InvLeftVector.append(FreeCAD.Vector(xInvLeft[i],yInvLeft[i],0));
    InvRightVector.append(FreeCAD.Vector(xInvRight[i],yInvRight[i],0));


addendumCirle=Draft.makeCircle(addendumRadius);
InvLeft=Draft.makeBSpline(Part.makePolygon(InvLeftVector),OPEN,WIRE_FRAME);
InvRight=Draft.makeBSpline(Part.makePolygon(InvRightVector),OPEN,WIRE_FRAME);
clearanceLeftX=FreeCAD.Vector(xInvLeft[0]-clearance+filletRadius,yInvLeft[0],0);
clearanceRightX=FreeCAD.Vector(xInvRight[0]-clearance+filletRadius,yInvRight[0],0);
lineLeft=Draft.makeLine(InvLeftVector[0],clearanceLeftX);
lineRight=Draft.makeLine(InvRightVector[0],clearanceRightX);
clearanceLeftY=FreeCAD.Vector(xInvLeft[0]-clearance,yInvLeft[0]+filletRadius,0);
clearanceRightY=FreeCAD.Vector(xInvRight[0]-clearance,yInvRight[0]-filletRadius,0);
lineClearance=Draft.makeLine(clearanceLeftY,clearanceRightY);
filletLeftCenter=FreeCAD.Placement();
filletRightCenter=FreeCAD.Placement();
filletLeftCenter.move(FreeCAD.Vector(xInvLeft[0]-clearance+filletRadius,\
                        yInvLeft[0]+filletRadius,0));
filletRightCenter.move(FreeCAD.Vector(xInvRight[0]-clearance+filletRadius,\
                        yInvRight[0]-filletRadius,0));
startangle=180;
endangle=270;
filletLeft=Draft.makeCircle(filletRadius,filletLeftCenter,WIRE_FRAME,startangle,endangle);
startangle=90;
endangle=180;
filletRight=Draft.makeCircle(filletRadius,filletRightCenter,WIRE_FRAME,startangle,endangle);
radius=math.sqrt(xInvLeft[len(xInvLeft)-1]**2+yInvLeft[len(xInvLeft)-1]**2);
arcAngle=math.atan(yInvLeft[len(xInvLeft)-1]/xInvLeft[len(xInvLeft)-1])*180/math.pi;
startangle=arcAngle;
endangle=-arcAngle;
arc=Draft.makeCircle(radius,PLACEMENT,WIRE_FRAME,startangle,endangle);
cutWire, deletedFeatures=Draft.upgrade([arc,lineRight,lineLeft,lineClearance,\
                                        InvRight,InvLeft,filletRight,filletLeft],DELETE);
cutFace, deletedFeatures=Draft.upgrade(cutWire,DELETE);
cutFaces=[]
cutFaces.append(cutFace[0]);
while(angle<360):
    cutFaces.append(Draft.rotate(cutFaces[0],angle,ORIGIN,ZAXIS,COPY));
    angle+=360/TEETH;
profile=addendumCirle;
for i in range(len(cutFaces)):
    profile=Draft.cut(profile,cutFaces[i]);
################################################################################
profile.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,height),FreeCAD.Rotation(ZAXIS,0),ORIGIN);
doc.addObject('Part::Loft','bevelGear');
doc.bevelGear.Sections=[profileBottom,profile];
doc.bevelGear.Solid=True;
doc.bevelGear.Ruled=False;
doc.bevelGear.Closed=False;
################################################################################
