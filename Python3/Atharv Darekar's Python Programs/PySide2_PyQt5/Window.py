from PySide2.QtWidgets import QApplication, QWidget
import time
import sys
class Window(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Window") #sets window title
        self.setGeometry(0,0,300,300) #sets window geometry (x,y,width,height)
        self.setMaximumHeight(400) #sets maximum limit of height for the window
        self.setMaximumWidth(400) #sets maximum limit of width for the window
        self.setMinimumHeight(100) #sets minimum limit of height for the window
        self.setMinimumWidth(100) #sets minimum limit of width for the window
obj_QApplication=QApplication(sys.argv)
obj_Window=Window()
obj_Window.show() #displays the window
time.sleep(5) #sleeps the thread
obj_Window.resize(100,100) #resizes the window
obj_QApplication.exec_()
sys.exit(0)
