# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'ProgressBar.ui'
#
# Created by: PyQt5 UI code generator 5.14.1
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets


class MainProgramGui(object):
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(200, 200)
        MainWindow.setMinimumSize(QtCore.QSize(200, 200))
        MainWindow.setMaximumSize(QtCore.QSize(200, 200))
        icon = QtGui.QIcon()
        icon.addPixmap(QtGui.QPixmap("/home/absdarekar/GitHub/Training/Python3/Libraries/PySide2_PyQt5/icon.png"), QtGui.QIcon.Normal, QtGui.QIcon.Off)
        MainWindow.setWindowIcon(icon)
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.verticalLayout = QtWidgets.QVBoxLayout(self.centralwidget)
        self.verticalLayout.setObjectName("verticalLayout")
        self.run = QtWidgets.QPushButton(self.centralwidget)
        self.run.setObjectName("run")
        self.verticalLayout.addWidget(self.run)
        self.quit = QtWidgets.QPushButton(self.centralwidget)
        self.quit.setObjectName("quit")
        self.verticalLayout.addWidget(self.quit)
        MainWindow.setCentralWidget(self.centralwidget)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "MainWindow"))
        self.run.setText(_translate("MainWindow", "Run"))
        self.quit.setText(_translate("MainWindow", "Quit"))


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = MainProgramGui()
    ui.setupUi(MainWindow)
    MainWindow.show()
    sys.exit(app.exec_())
