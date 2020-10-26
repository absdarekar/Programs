from PySide2.QtWidgets import QApplication, QWidget, QDesktopWidget, QPushButton, QMessageBox
from PySide2.QtGui import QIcon
import sys
class Button(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Message Box and Buttons")
        self.setGeometry(0,0,400,400)
        self.setIcon()
        self.centering()
        self.setButton()
    def setIcon(self):
        icon=QIcon("/home/ubuntu/Documents/Python3/PySide2/icon.png")
        self.setWindowIcon(icon)
    def centering(self):
        window=self.frameGeometry() #generates object of frame geometry of the window
        center=QDesktopWidget().availableGeometry().center() #defines center point
        window.moveCenter(center) #sets the windows center to defined point
        self.move(window.topLeft()) #moves the window to the point refering top left of the window
    def setButton(self):
        self.aboutButton=QPushButton("About",self) #defines about button (title)
        self.aboutButton.move(50,350)
        self.aboutButton.clicked.connect(self.about) #defines signal
        quit_butn=QPushButton("Quit",self) #label of the button
        quit_butn.move(150,350)
        quit_butn.clicked.connect(self.quit) #defines signal
    def about(self): #defines slot for the signal of about button
        QMessageBox.about(self.aboutButton,"About","About Text") #displays message (signal,title,message)
    def quit(self): #defines slot for the signal of push button to quit
        user_input=QMessageBox.question(self,"Quit","Do you want to quit?",QMessageBox.Yes|QMessageBox.No) #gets user input for question (title,question,yex|no)
        if user_input==QMessageBox.Yes:
            obj_QApplication.quit() #quits the window
        elif user_input==QMessageBox.No:
            pass
obj_QApplication=QApplication(sys.argv)
obj_Button=Button()
obj_Button.show()
obj_QApplication.exec_()
sys.exit(0)
