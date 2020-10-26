from PyQt5.QtWidgets import QApplication, QPushButton, QDialog, QVBoxLayout, QLabel, QStackedWidget
from PyQt5 import QtGui
import sys
class StackWidget(QDialog):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Context Window")
        self.setWindowIcon(QtGui.QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png"))
        self.setGeometry(0,0,500,400)
        self.stackWidget()
        self.show()
    def stackWidget(self):
        vbox=QVBoxLayout()
        self.obj_QStackedWidget__stackWidget=QStackedWidget()
        vbox.addWidget(self.obj_QStackedWidget__stackWidget)
        for x in range(0,8):
            label=QLabel("Stacked Child "+str(x))
            label.setFont(QtGui.QFont("Sanserif",15))
            label.setStyleSheet('color:red')
            self.obj_QStackedWidget__stackWidget.addWidget(label)
            self.button=QPushButton("Stack "+str(x))
            self.button.setStyleSheet('background-color:blue')
            vbox.addWidget(self.button)
        self.setLayout(vbox)
obj_QApplication=QApplication(sys.argv)
obj_StackWidget=StackWidget()
sys.exit(obj_QApplication.exec())
