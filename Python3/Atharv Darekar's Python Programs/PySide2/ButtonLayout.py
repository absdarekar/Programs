from PySide2.QtWidgets import QApplication, QWidget, QDialog, QGridLayout, QHBoxLayout, QVBoxLayout, QGroupBox, QPushButton, QMessageBox
from PySide2.QtGui import QIcon, QFont
import sys
class ButtonLayout(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Message Box and Button in Layout")
        self.setGeometry(0,0,400,400)
        self.setIcon()
        self.setButton()
        vbox=QVBoxLayout()
        vbox.addWidget(self.groupBox)
        self.setLayout(vbox)
        self.show()
    def setIcon(self):
        self.setWindowIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png"))
    def setButton(self):
        self.about_butn=QPushButton("About",self)
        self.about_butn.clicked.connect(self.about)
        self.quit_butn=QPushButton("Quit",self)
        self.quit_butn.clicked.connect(self.quit)
        self.groupBox=QGroupBox("")
        self.groupBox.setFont(QFont("Sanserif",13))
        hbox=QHBoxLayout()
        hbox.addWidget(self.about_butn)
        hbox.addWidget(self.quit_butn)
        self.groupBox.setLayout(hbox)
    def about(self):
        QMessageBox.about(self.about_butn,"About","About Text")
    def quit(self):
        user_input=QMessageBox.question(self,"Quit","Do you want to quit?",QMessageBox.Yes|QMessageBox.No)
        if user_input==QMessageBox.Yes:
            obj_QApplication.quit()
        elif user_input==QMessageBox.No:
            pass
obj_QApplication=QApplication(sys.argv)
obj_ButtonLayout=ButtonLayout()
obj_QApplication.exec_()
sys.exit(0)
