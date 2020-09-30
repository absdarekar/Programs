from PySide2.QtWidgets import QApplication, QWidget, QLabel, QToolTip
from PySide2.QtGui import QIcon, QPixmap, QFont
import sys
class ToolTip(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("ToolTip")
        self.setGeometry(0,0,300,300)
        QToolTip.setFont(QFont("Decorative",10,QFont.Bold)) #defines tooltip, tooltip font (font,size,style)
        self.setToolTip("Main Window") #sets tool tip for the main window
        self.setIcon()
        self.setIconModes()
    def setIcon(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png")
        self.setWindowIcon(icon)
    def setIconModes(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png")
        label1=QLabel("Active Icon",self)
        pixmap1=icon.pixmap(100,100,QIcon.Active,QIcon.On)
        label1.setPixmap(pixmap1)
        label1.setToolTip("Active Icon")
        label2=QLabel("Inactive Icon",self)
        pixmap2=icon.pixmap(100,100,QIcon.Disabled,QIcon.Off)
        label2.setPixmap(pixmap2)
        label2.move(100,0)
        label2.setToolTip("Inactive Icon") #sets tooltip (text)
        label3=QLabel("Selected Icon",self)
        pixmap3=icon.pixmap(100,100,QIcon.Selected,QIcon.On)
        label3.setPixmap(pixmap3)
        label3.move(0,100)
        label3.setToolTip("Selected Icon")
obj_QApplication=QApplication(sys.argv)
obj_ToolTip=ToolTip()
obj_ToolTip.show()
obj_QApplication.exec_()
sys.exit(0)
