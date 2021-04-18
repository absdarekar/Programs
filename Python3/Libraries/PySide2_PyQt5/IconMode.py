from PySide2.QtWidgets import QApplication, QWidget, QLabel
from PySide2.QtGui import QIcon, QPixmap
import sys
class IconMode(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Icon Mode")
        self.setGeometry(0,0,300,300)
        self.setIcon()
        self.setIconModes()
    def setIcon(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png")
        self.setWindowIcon(icon)
    def setIconModes(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png")
        label1=QLabel("Active Icon",self) #generates a place holder object for media
        pixmap1=icon.pixmap(100,100,QIcon.Active,QIcon.On) #generates avtive image (width,height,activity status,icon status)
        label1.setPixmap(pixmap1) #sets image
        label2=QLabel("Inactive Icon",self)
        pixmap2=icon.pixmap(100,100,QIcon.Disabled,QIcon.Off) #generates inactive image
        label2.setPixmap(pixmap2)
        label2.move(100,0) #moves the image
        label3=QLabel("Selected Icon",self)
        pixmap3=icon.pixmap(100,100,QIcon.Selected,QIcon.On) #generates selected image
        label3.setPixmap(pixmap3)
        label3.move(0,100)
obj_QApplication=QApplication(sys.argv)
obj_IconMode=IconMode()
obj_IconMode.show()
obj_QApplication.exec_()
sys.exit(0)
