# import os;
# import sys;
# import time;
# import math;
# import numpy;
# import FreeCAD;
# import Draft;
# import Part;
# from PyQt5 import QtCore, QtGui, QtWidgets;
# OCTOCAD_FILES_PATH=os.path.join(os.path.expanduser('~'),'OctoCAD');
# OCTOCAD_APPDATA_PATH=os.path.join(os.path.expanduser('~'),'.OctoCAD');
# sys.path.insert(1,OCTOCAD_FILES_PATH);
# from bin.gear.InvoluteProfile import InvoluteProfile;
# from StatusGui import StatusGui;
# class Model():
#     def __init__(self):
#         self.setupStatus();
#         self.updateStatus("Initiating data");
#         self.pressureAngle=20;
#         self.bottomModule=4;
#         self.teeth=18;
#         self.gearing="";
#         self.faceWidth=20;
#         self.clearance=0.5;
#         self.fillet=0.25;
#         self.gearRatio=1.25;
#         self.updateStatus("Calculating parameters");
#         self.pinionPitchAngle=math.atan(self.gearRatio);
#         self.gearPitchAngle=math.atan(1/self.gearRatio);
#         self.pinionTopModule=self.bottomModule-\
#                             ((2*self.faceWidth*math.sin(self.pinionPitchAngle))/self.teeth);
#         self.gearTopModule=self.bottomModule-\
#                             ((2*self.faceWidth*math.sin(self.gearPitchAngle))/self.teeth);
#         self.pinionHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
#                                         2-self.pinionTopModule*self.teeth/2)**2));
#         self.gearHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
#                                         2-self.gearTopModule*self.teeth/2)**2));
#         self.fileName="Bevel";
#     def generateModel(self):
#         self.updateStatus("Defining coordinates");
#         ORIGIN=FreeCAD.Vector(0,0,0);
#         ZAXIS=FreeCAD.Vector(0,0,1);
#         self.updateStatus("Creating FreeCAD document file for bevel pinion");
#         docPinion=FreeCAD.newDocument(self.fileName+" Pinion");
#         self.updateStatus("Generating base involute profile");
#         profileBottom, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.bottomModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Generating involute profile for bevel pinion");
#         pinionProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.pinionTopModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Placing the involute profile of bevel pinion");
#         pinionProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.pinionHeight),\
#                                                     FreeCAD.Rotation(ZAXIS,0),ORIGIN);
#         self.updateStatus("Generating bevel pinion");
#         docPinion.addObject('Part::Loft','bevelPinion');
#         docPinion.bevelPinion.Sections=[profileBottom,pinionProfileTop];
#         docPinion.bevelPinion.Solid=True;
#         docPinion.bevelPinion.Ruled=False;
#         docPinion.bevelPinion.Closed=False;
#         docPinion.recompute();
#         self.updateStatus("Done");
#         self.updateStatus("Creating FreeCAD document file for bevel gear");
#         docGear=FreeCAD.newDocument(self.fileName+" Gear");
#         self.updateStatus("Generating involute profile for bevel gear");
#         gearProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.gearTopModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Placing the involute profile of bevel gear");
#         gearProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.gearHeight),\
#                                                     FreeCAD.Rotation(ZAXIS,0),ORIGIN);
#         self.updateStatus("Generating bevel gear");
#         docGear.addObject('Part::Loft','bevelGear');
#         docGear.bevelGear.Sections=[profileBottom,gearProfileTop];
#         docGear.bevelGear.Solid=True;
#         docGear.bevelGear.Ruled=False;
#         docGear.bevelGear.Closed=False;
#         docGear.recompute();
#         self.updateStatus("Done");
#     def setupStatus(self):
#         self.start=time.time();
#         self.statusGui=StatusGui();
#         self.status=QtWidgets.QDialog();
#         self.statusGui.setupUi(self.status);
#         self.status.show();
#     def updateStatus(self,message):
#         timeStamp=str(round(time.time()-self.start,2))
#         self.statusGui.status.append("["+timeStamp+"] "+message);
# if __name__=="__main__":
#     model=Model();
#     model.generateModel();
# Result:
# 1. Status window pops up satisfactorily
# 2. FreeCAD executes the script satisfactorily
# 3. Status window and FreeCAD window blackouts during execution
# 4. Status window is updated after execution
################################################################################

# import os;
# import sys;
# import time;
# import math;
# import numpy;
# import FreeCAD;
# import Draft;
# import Part;
# from PyQt5 import QtCore, QtGui, QtWidgets;
# OCTOCAD_FILES_PATH=os.path.join(os.path.expanduser('~'),'OctoCAD');
# OCTOCAD_APPDATA_PATH=os.path.join(os.path.expanduser('~'),'.OctoCAD');
# sys.path.insert(1,OCTOCAD_FILES_PATH);
# from bin.gear.InvoluteProfile import InvoluteProfile;
# from StatusGui import StatusGui;
# class Model():
#     def __init__(self):
#         self.setupStatus();
#         self.updateStatus("Initiating data");
#         self.pressureAngle=20;
#         self.bottomModule=4;
#         self.teeth=18;
#         self.gearing="";
#         self.faceWidth=20;
#         self.clearance=0.5;
#         self.fillet=0.25;
#         self.gearRatio=1.25;
#         self.updateStatus("Calculating parameters");
#         self.pinionPitchAngle=math.atan(self.gearRatio);
#         self.gearPitchAngle=math.atan(1/self.gearRatio);
#         self.pinionTopModule=self.bottomModule-\
#                             ((2*self.faceWidth*math.sin(self.pinionPitchAngle))/self.teeth);
#         self.gearTopModule=self.bottomModule-\
#                             ((2*self.faceWidth*math.sin(self.gearPitchAngle))/self.teeth);
#         self.pinionHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
#                                         2-self.pinionTopModule*self.teeth/2)**2));
#         self.gearHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
#                                         2-self.gearTopModule*self.teeth/2)**2));
#         self.fileName="Bevel";
#     def generateModel(self):
#         self.updateStatus("Defining coordinates");
#         ORIGIN=FreeCAD.Vector(0,0,0);
#         ZAXIS=FreeCAD.Vector(0,0,1);
#         self.updateStatus("Creating FreeCAD document file for bevel pinion");
#         docPinion=FreeCAD.newDocument(self.fileName+" Pinion");
#         self.updateStatus("Generating base involute profile");
#         profileBottom, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.bottomModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Generating involute profile for bevel pinion");
#         pinionProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.pinionTopModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Placing the involute profile of bevel pinion");
#         pinionProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.pinionHeight),\
#                                                     FreeCAD.Rotation(ZAXIS,0),ORIGIN);
#         self.updateStatus("Generating bevel pinion");
#         docPinion.addObject('Part::Loft','bevelPinion');
#         docPinion.bevelPinion.Sections=[profileBottom,pinionProfileTop];
#         docPinion.bevelPinion.Solid=True;
#         docPinion.bevelPinion.Ruled=False;
#         docPinion.bevelPinion.Closed=False;
#         docPinion.recompute();
#         self.updateStatus("Done");
#         self.updateStatus("Creating FreeCAD document file for bevel gear");
#         docGear=FreeCAD.newDocument(self.fileName+" Gear");
#         self.updateStatus("Generating involute profile for bevel gear");
#         gearProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
#                                                         self.gearTopModule,\
#                                                         self.teeth,self.faceWidth,\
#                                                         self.clearance,self.fillet);
#         self.updateStatus("Placing the involute profile of bevel gear");
#         gearProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.gearHeight),\
#                                                     FreeCAD.Rotation(ZAXIS,0),ORIGIN);
#         self.updateStatus("Generating bevel gear");
#         docGear.addObject('Part::Loft','bevelGear');
#         docGear.bevelGear.Sections=[profileBottom,gearProfileTop];
#         docGear.bevelGear.Solid=True;
#         docGear.bevelGear.Ruled=False;
#         docGear.bevelGear.Closed=False;
#         docGear.recompute();
#         self.updateStatus("Done");
#     def setupStatus(self):
#         self.start=time.time();
#         self.statusGui=StatusGui();
#         self.status=QtWidgets.QDialog();
#         self.statusGui.setupUi(self.status);
#         self.status.show();
#     def updateStatus(self,message):
#         timeStamp=str(round(time.time()-self.start,2))
#         self.statusGui.status.append("["+timeStamp+"] "+message);
# if __name__=="__main__":
#     qApplication=QtCore.QCoreApplication([]);
#     qThread=QtCore.QThread();
#     model=Model();
#     model.moveToThread(qThread);
#     model.finished.connect(qThread.quit);
#     qThread.started.connect(model.generateModel);
#     qThread.finished.connect(qApplication.exit);
#     qThread.start();
#     sys.exit(qApplication.exec_());
# Result:
# 1. Aborted (core dumped) error reported as soon as FreeCAD script execution starts
# 2. Status window and FreeCAD window crashes
################################################################################

import os;
import sys;
import time;
import math;
import numpy;
import FreeCAD;
import Draft;
import Part;
from PyQt5 import QtCore, QtGui, QtWidgets;
OCTOCAD_FILES_PATH=os.path.join(os.path.expanduser('~'),'OctoCAD');
OCTOCAD_APPDATA_PATH=os.path.join(os.path.expanduser('~'),'.OctoCAD');
sys.path.insert(1,OCTOCAD_FILES_PATH);
from bin.gear.InvoluteProfile import InvoluteProfile;
from StatusGui import StatusGui;
class Model():
    def __init__(self):
        self.setupStatus();
        self.updateStatus("Initiating data");
        self.pressureAngle=20;
        self.bottomModule=4;
        self.teeth=18;
        self.gearing="";
        self.faceWidth=20;
        self.clearance=0.5;
        self.fillet=0.25;
        self.gearRatio=1.25;
        self.updateStatus("Calculating parameters");
        self.pinionPitchAngle=math.atan(self.gearRatio);
        self.gearPitchAngle=math.atan(1/self.gearRatio);
        self.pinionTopModule=self.bottomModule-\
                            ((2*self.faceWidth*math.sin(self.pinionPitchAngle))/self.teeth);
        self.gearTopModule=self.bottomModule-\
                            ((2*self.faceWidth*math.sin(self.gearPitchAngle))/self.teeth);
        self.pinionHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
                                        2-self.pinionTopModule*self.teeth/2)**2));
        self.gearHeight=math.sqrt((self.faceWidth**2-(self.bottomModule*self.teeth/\
                                        2-self.gearTopModule*self.teeth/2)**2));
        self.fileName="Bevel";
    def generateModel(self):
        self.updateStatus("Defining coordinates");
        ORIGIN=FreeCAD.Vector(0,0,0);
        ZAXIS=FreeCAD.Vector(0,0,1);
        self.updateStatus("Creating FreeCAD document file for bevel pinion");
        docPinion=FreeCAD.newDocument(self.fileName+" Pinion");
        self.updateStatus("Generating base involute profile");
        profileBottom, height=InvoluteProfile.generateProfile(self.pressureAngle,\
                                                        self.bottomModule,\
                                                        self.teeth,self.faceWidth,\
                                                        self.clearance,self.fillet);
        self.updateStatus("Generating involute profile for bevel pinion");
        pinionProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
                                                        self.pinionTopModule,\
                                                        self.teeth,self.faceWidth,\
                                                        self.clearance,self.fillet);
        self.updateStatus("Placing the involute profile of bevel pinion");
        pinionProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.pinionHeight),\
                                                    FreeCAD.Rotation(ZAXIS,0),ORIGIN);
        self.updateStatus("Generating bevel pinion");
        docPinion.addObject('Part::Loft','bevelPinion');
        docPinion.bevelPinion.Sections=[profileBottom,pinionProfileTop];
        docPinion.bevelPinion.Solid=True;
        docPinion.bevelPinion.Ruled=False;
        docPinion.bevelPinion.Closed=False;
        docPinion.recompute();
        self.updateStatus("Done");
        self.updateStatus("Creating FreeCAD document file for bevel gear");
        docGear=FreeCAD.newDocument(self.fileName+" Gear");
        self.updateStatus("Generating involute profile for bevel gear");
        gearProfileTop, height=InvoluteProfile.generateProfile(self.pressureAngle,\
                                                        self.gearTopModule,\
                                                        self.teeth,self.faceWidth,\
                                                        self.clearance,self.fillet);
        self.updateStatus("Placing the involute profile of bevel gear");
        gearProfileTop.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,self.gearHeight),\
                                                    FreeCAD.Rotation(ZAXIS,0),ORIGIN);
        self.updateStatus("Generating bevel gear");
        docGear.addObject('Part::Loft','bevelGear');
        docGear.bevelGear.Sections=[profileBottom,gearProfileTop];
        docGear.bevelGear.Solid=True;
        docGear.bevelGear.Ruled=False;
        docGear.bevelGear.Closed=False;
        docGear.recompute();
        self.updateStatus("Done");
    def setupStatus(self):
        self.start=time.time();
        self.statusGui=StatusGui();
        self.status=QtWidgets.QDialog();
        self.statusGui.setupUi(self.status);
        self.status.show();
    def updateStatus(self,message):
        timeStamp=str(round(time.time()-self.start,2))
        self.statusGui.status.append("["+timeStamp+"] "+message);
        QtWidgets.QApplication.processEvents();
if __name__=="__main__":
    model=Model();
    model.generateModel();
# Result:
# 1. Works satisfactorily
################################################################################
