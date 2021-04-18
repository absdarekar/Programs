import sys;
import os;
OCTOCAD_FILES_PATH=os.path.join(os.path.expanduser('~'),'OctoCAD');
OCTOCAD_APPDATA_PATH=os.path.join(os.path.expanduser('~'),'.OctoCAD');
os.makedirs(OCTOCAD_APPDATA_PATH+"/gear/spur", exist_ok=True);
sys.path.insert(1,OCTOCAD_FILES_PATH);
from PyQt5 import QtCore, QtGui, QtWidgets;
from PyQt5.QtWidgets import QFileDialog;
from gui.octocad.OutputGui import OutputGui;
class Output():
    def ui(self):
        self.MainWindow = QtWidgets.QMainWindow();
        self.obj_OutputGui=OutputGui();
        self.obj_OutputGui.setupUi(self.MainWindow);
        self.write();
        self.obj_OutputGui.plainTextEdit.setPlainText(open(OCTOCAD_APPDATA_PATH+"/gear/spur/design").read());
        self.MainWindow.show();
        close=self.obj_OutputGui.buttonBox.button(QtWidgets.QDialogButtonBox.Close);
        close.clicked.connect(self.MainWindow.close);
        save=self.obj_OutputGui.buttonBox.button(QtWidgets.QDialogButtonBox.Save);
        save.clicked.connect(self.save);
    def write(self,path=OCTOCAD_APPDATA_PATH+"/gear/spur/design"):
        with open(path,"w+") as design_f:
            with open(OCTOCAD_FILES_PATH+"/LICENSE.md","r") as license_f:
                LICENSE=license_f.read();
                design_f.write(LICENSE);
        return path;
    def save(self):
        fileName, selectedFilter=QFileDialog.getSaveFileName(caption='',directory=os.path.expanduser('~'));
        with open(fileName,"w") as fileName_f:
            with open(self.write(),"r") as text_f:
                text=text_f.read();
                fileName_f.write(text);
if __name__=="__main__":
    obj_QApplication=QtWidgets.QApplication(sys.argv);
    obj_Output=Output();
    obj_Output.ui();
    sys.exit(obj_QApplication.exec_());
