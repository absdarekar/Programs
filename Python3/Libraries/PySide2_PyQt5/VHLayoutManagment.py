from PySide2.QtWidgets import QApplication, QWidget, QDialog, QGridLayout, QHBoxLayout, QVBoxLayout, QGroupBox, QPushButton
from PySide2.QtGui import QIcon, QFont
import sys
class VHLayoutManagment(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Vertical & Horizontal Layout Managment")
        self.setGeometry(0,0,500,500)
        self.setIcon()
        self.createLayout()
        vbox=QVBoxLayout() #generates object for layout
        vbox.addWidget(self.groupBox) #add group box to the layout
        self.setLayout(vbox) #sets the layout
        self.show()
    def setIcon(self):
        self.setWindowIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png"))
    def createLayout(self):
        self.groupBox=QGroupBox("Select a language") #title of the layout
        self.groupBox.setFont(QFont("Sanserif",13)) #sets font and font size of text layout
        hbox=QHBoxLayout() #generates object of the layout
        btn_eng=QPushButton("English")
        btn_eng.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/united-kingdom-flag-icon-256.png"))
        btn_eng.setMinimumHeight(40)
        hbox.addWidget(btn_eng) #adds the button to the layout
        btn_spn=QPushButton("Español")
        btn_spn.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/spain-flag-icon-256.png"))
        btn_spn.setMinimumHeight(40)
        hbox.addWidget(btn_spn)
        btn_hin=QPushButton("हिंदी")
        btn_hin.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/india-flag-icon-256.png"))
        btn_hin.setMinimumHeight(40)
        hbox.addWidget(btn_hin)
        self.groupBox.setLayout(hbox) #sets the group box
obj_QApplication=QApplication(sys.argv)
obj_VHLayoutManagment=VHLayoutManagment()
obj_QApplication.exec_()
sys.exit(0)
