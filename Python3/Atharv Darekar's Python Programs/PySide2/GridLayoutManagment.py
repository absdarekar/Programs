from PySide2.QtWidgets import QApplication, QWidget, QDialog, QGridLayout, QVBoxLayout, QGroupBox, QPushButton
from PySide2.QtGui import QIcon, QFont
import sys
class GridLayoutManagment(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Grid Layout Managment")
        self.setGeometry(0,0,500,500)
        self.setIcon()
        self.createGrid()
        vbox=QVBoxLayout()
        vbox.addWidget(self.groupBox)
        self.setLayout(vbox)
        self.show()
    def setIcon(self):
        self.setWindowIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png"))
    def createGrid(self):
        self.groupBox=QGroupBox("Select Programming Language")
        self.groupBox.setFont(QFont("Sanserif", 13))
        gridLayout=QGridLayout() #generates object of the layout
        btn_java=QPushButton("Java",self)
        btn_java.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/java.png"))
        gridLayout.addWidget(btn_java,0,0) #adds button (button,row,column)
        btn_c=QPushButton("C",self)
        btn_c.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/c.jpg"))
        gridLayout.addWidget(btn_c,0,1)
        btn_arduino=QPushButton("Arduino",self)
        btn_arduino.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/arduino.png"))
        gridLayout.addWidget(btn_arduino,1,0)
        btn_python=QPushButton("Python",self)
        btn_python.setIcon(QIcon("/home/ubuntu/Documents/Python3/PySide2/python.png"))
        gridLayout.addWidget(btn_python,1,1)
        self.groupBox.setLayout(gridLayout)
obj_QApplication=QApplication(sys.argv)
obj_GridLayoutManagment=GridLayoutManagment()
obj_QApplication.exec_()
sys.exit(0)
