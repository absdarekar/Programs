#!/usr/bin/python3
import sys
import os
import threading
from PyQt5 import QtCore, QtGui, QtWidgets
from MainProgramGui import MainProgramGui
class MainProgram():
    def __init__(self):
        self.mainProgram=QtWidgets.QMainWindow()
        self.mainProgramGui=MainProgramGui()
        self.mainProgramGui.setupUi(self.mainProgram)
        self.mainProgram.show()
        self.mainProgramGui.run.clicked.connect(self.runMainProgram)
        self.mainProgramGui.quit.clicked.connect(self.quitMainProgram)
    def runMainProgram(self):
        name="bevelGear"
        path="/home/absdarekar/GitHub/Training/FreeCAD/Examples/BevelGear.py"
        command=lambda:os.system("freecad "+path)
        thread=threading.Thread(target=command,name=name)
        thread.start()
        self.mainProgram.hide()
        thread.join()
        self.mainProgram.show()
    def quitMainProgram(self):
        qApplication.quit()
if __name__=="__main__":
    qApplication=QtWidgets.QApplication(sys.argv)
    mainProgram=MainProgram()
    sys.exit(qApplication.exec_())
