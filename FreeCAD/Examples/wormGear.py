import FreeCAD;
import FreeCADGui;
import Draft;
import Part;
import math;
import numpy;


doc=FreeCAD.newDocument("Worm Gear");


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
angularSeperation=-1*(math.pi/(2*TEETH)+(math.tan(PRESSURE_ANGLE)-PRESSURE_ANGLE));
clearance=0.5*MODULE; # 20 degree full depth involute tooth
filletRadius=0.25*MODULE # should not exceed clearance
ratioAddendum=addendumRadius/baseRadius;
ratioDedendum=dedendumRadius/baseRadius;


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
arcAngle=-1*(math.atan(yInvLeft[len(xInvLeft)-1]/xInvLeft[len(xInvLeft)-1])*180/math.pi);
startangle=arcAngle;
endangle=-arcAngle;
arc=Draft.makeCircle(radius,PLACEMENT,WIRE_FRAME,startangle,endangle);
toothWire, deletedFeatures=Draft.upgrade([arc,lineRight,lineLeft,lineClearance,\
                                        InvRight,InvLeft,filletRight,filletLeft],DELETE);
tooth, deletedFeatures=Draft.upgrade(toothWire,DELETE);


XAXIS=FreeCAD.Vector(1,0,0);
INTERFERANCE=0.1;
tooth=tooth[0];
tooth=Draft.rotate(tooth,90,ORIGIN,XAXIS,not(COPY));
pitch=math.pi*MODULE;
helixRadius=MODULE*TEETH*math.cos(PRESSURE_ANGLE)/2-clearance;
helix=Part.makeHelix(pitch,MODULE*20,helixRadius);
doc.addObject("Part::Feature","helix");
doc.helix.Shape=helix;
doc.addObject("Part::Sweep","threads");
doc.threads.Sections=doc.findObjects("Part::Feature",tooth.Name);
doc.threads.Spine=doc.helix;
doc.threads.Solid=True;
doc.threads.Frenet=True;
worm=Part.makeCylinder(tooth.Shape.BoundBox.XMin+INTERFERANCE,MODULE*20);
doc.addObject("Part::Feature","worm");
doc.worm.Shape=worm;
doc.addObject("Part::MultiFuse","wormGear");
doc.wormGear.Shapes=[doc.threads,doc.worm,];
FreeCADGui.ActiveDocument.getObject(tooth.Name).Visibility=False;
FreeCADGui.ActiveDocument.getObject("helix").Visibility=False;
FreeCADGui.ActiveDocument.getObject("threads").Visibility=False;
FreeCADGui.ActiveDocument.getObject("worm").Visibility=False;
doc.recompute();
