from PySide2.QtWidgets import QApplication, QWidget
from PySide2.QtGui import QIcon
import sys
class Icon(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("PySide2 Qt Python3")
        self.setGeometry(0,0,300,300)
        self.setIcon() #calls setIcon funtion
    def setIcon(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png") #generates object of the icon file
        self.setWindowIcon(icon) #sets icon
obj_QApplication=QApplication(sys.argv)
obj_Icon=Icon()
obj_Icon.show()
obj_QApplication.exec_()
sys.exit(0)
