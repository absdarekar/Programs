from PyQt5.QtWidgets import (QApplication, QComboBox, QDialog,
QDialogButtonBox, QFormLayout, QGridLayout, QGroupBox, QHBoxLayout,
QLabel, QLineEdit, QMenu, QMenuBar, QPushButton, QSpinBox, QTextEdit,
QVBoxLayout)
import sys
class Dialog(QDialog):
    NumGridRows = 3
    NumButtons = 4
    def __init__(self):
        super(Dialog, self).__init__()
        self.createFormGroupBox()
        buttonBox = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel)
        buttonBox.accepted.connect(self.submit)
        buttonBox.rejected.connect(self.reject)
        mainLayout = QVBoxLayout()
        mainLayout.addWidget(self.formGroupBox)
        mainLayout.addWidget(buttonBox)
        self.setLayout(mainLayout)
        self.setWindowTitle("Form Layout")
    def createFormGroupBox(self):
        self.formGroupBox = QGroupBox("Form layout")
        layout = QFormLayout()
        self.name=QLineEdit()
        self.age=QSpinBox()
        layout.addRow(QLabel("Name:"),self.name)
        layout.addRow(QLabel("Country:"), QComboBox())
        layout.addRow(QLabel("Age:"),self.age)
        self.formGroupBox.setLayout(layout)
    def submit(self):
        print('Your name: ' + self.name.text())
        print('Your age: ' + self.age.text())
        app.quit()
app = QApplication(sys.argv)
dialog = Dialog()
dialog.exec_()
sys.exit(0)
