import sys;
import os;
OCTOCAD_FILES_PATH=os.path.join(os.path.expanduser('~'),'OctoCAD');
OCTOCAD_APPDATA_PATH=os.path.join(os.path.expanduser('~'),'.OctoCAD');
os.makedirs(OCTOCAD_APPDATA_PATH+"/gear/spur", exist_ok=True);
sys.path.insert(1,OCTOCAD_FILES_PATH);
from PyQt5 import QtCore, QtGui, QtWidgets;
from gui.octocad.OutputGui import Ui_MainWindow;
class Output():
    def ui(self):
        self.MainWindow = QtWidgets.QMainWindow();
        self.obj_OutputGui=Ui_MainWindow();
        self.obj_OutputGui.setupUi(self.MainWindow);
        self.write();
        self.obj_OutputGui.plainTextEdit.setPlainText(open(OCTOCAD_APPDATA_PATH+"/gear/spur/sample").read());
        self.MainWindow.show();
    def write(self):
        with open(OCTOCAD_APPDATA_PATH+"/gear/spur/sample","w+") as sample_f:
            with open(OCTOCAD_FILES_PATH+"/LICENSE.md","r") as license_f:
                LICENSE=license_f.read();
                sample_f.write(LICENSE);
if __name__=="__main__":
    obj_QApplication=QtWidgets.QApplication(sys.argv);
    obj_Output=Output();
    obj_Output.ui();
    sys.exit(obj_QApplication.exec_());
