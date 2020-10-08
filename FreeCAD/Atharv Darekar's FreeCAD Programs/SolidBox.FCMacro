import FreeCAD;
import Part;
from PyQt5 import QtCore, QtGui, QtWidgets;
class SolidBox():

    # -*- coding: utf-8 -*-

    # Form implementation generated from reading ui file 'SolidBoxGui.ui'
    #
    # Created by: PyQt5 UI code generator 5.14.1
    #
    # WARNING! All changes made in this file will be lost!

    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(300, 250)
        Dialog.setMinimumSize(QtCore.QSize(300, 250))
        Dialog.setMaximumSize(QtCore.QSize(300, 250))
        self.gridLayout = QtWidgets.QGridLayout(Dialog)
        self.gridLayout.setObjectName("gridLayout")
        self.label_height = QtWidgets.QLabel(Dialog)
        self.label_height.setObjectName("label")
        self.gridLayout.addWidget(self.label_height, 0, 0, 1, 1)
        self.label_length = QtWidgets.QLabel(Dialog)
        self.label_length.setObjectName("label_2")
        self.gridLayout.addWidget(self.label_length, 1, 0, 1, 1)
        self.label_breadth = QtWidgets.QLabel(Dialog)
        self.label_breadth.setObjectName("label_3")
        self.gridLayout.addWidget(self.label_breadth, 2, 0, 1, 1)
        self.lineEdit_height = QtWidgets.QLineEdit(Dialog)
        self.lineEdit_height.setObjectName("lineEdit_height")
        self.lineEdit_height.setValidator(QtGui.QRegExpValidator(QtCore.QRegExp("[0-9_]+")))
        self.gridLayout.addWidget(self.lineEdit_height, 0, 1, 1, 1)
        self.lineEdit_length = QtWidgets.QLineEdit(Dialog)
        self.lineEdit_length.setObjectName("lineEdit_length")
        self.lineEdit_length.setValidator(QtGui.QRegExpValidator(QtCore.QRegExp("[0-9_]+")))
        self.gridLayout.addWidget(self.lineEdit_length, 1, 1, 1, 1)
        self.lineEdit_breadth = QtWidgets.QLineEdit(Dialog)
        self.lineEdit_breadth.setObjectName("lineEdit_breadth")
        self.lineEdit_breadth.setValidator(QtGui.QRegExpValidator(QtCore.QRegExp("[0-9_]+")))
        self.gridLayout.addWidget(self.lineEdit_breadth, 2, 1, 1, 1)
        self.buttonBox = QtWidgets.QDialogButtonBox(Dialog)
        self.buttonBox.setOrientation(QtCore.Qt.Horizontal)
        self.buttonBox.setStandardButtons(QtWidgets.QDialogButtonBox.Cancel|QtWidgets.QDialogButtonBox.Ok)
        self.buttonBox.setObjectName("buttonBox")
        self.gridLayout.addWidget(self.buttonBox, 3, 1, 1, 1)

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Solid Box"))
        self.label_height.setText(_translate("Dialog", "Height"))
        self.label_length.setText(_translate("Dialog", "Length"))
        self.label_breadth.setText(_translate("Dialog", "Breadth"))

    def ui(self):
        self.obj_QDialog__ui=QtWidgets.QDialog();
        self.setupUi(self.obj_QDialog__ui);
        self.obj_QDialog__ui.show();
        self.buttonBox.accepted.connect(self.model);
        self.buttonBox.rejected.connect(self.quit);
    def model(self):
        doc=FreeCAD.newDocument("Solid Box");
        doc.addObject("Part::Box", "SolidBox");
        doc.SolidBox.Height=self.lineEdit_height.text();
        doc.SolidBox.Length=self.lineEdit_length.text();
        doc.SolidBox.Width=self.lineEdit_breadth.text();
        doc.SolidBox.Placement=FreeCAD.Placement(FreeCAD.Vector(0,0,0),FreeCAD.Rotation(0,0,0));
        self.obj_QDialog__ui.hide();
    def quit(self):
        self.obj_QDialog__ui.hide();
if __name__=="__main__":
    obj_QApplication=QtWidgets.QApplication(sys.argv)
    obj_SolidBox=SolidBox();
    obj_SolidBox.ui();
    sys.exit(obj_QApplication.exec_())
