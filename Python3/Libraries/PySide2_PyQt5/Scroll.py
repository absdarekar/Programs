from PySide2 import QtGui
from PySide2.QtWidgets import QApplication, QWidget, QScrollArea, QVBoxLayout, QGroupBox, QLabel, QPushButton, QFormLayout, QStackedWidget
from PySide2.QtCore import Qt
import sys
class Window(QWidget):
    def __init__(self,val):
        super().__init__()
        self.title = "PyQt5 Scroll Bar"
        self.top = 200
        self.left = 500
        self.width = 400
        self.height = 300
        self.setWindowIcon(QtGui.QIcon("icon.png"))
        self.setWindowTitle(self.title)
        self.setGeometry(self.left, self.top, self.width, self.height)
        formLayout =QFormLayout()
        groupBox = QGroupBox("This Is Group Box")
        labelLis = []
        comboList = []
        for i in  range(val):
            labelLis.append(QLabel("Label"))
            comboList.append(QPushButton("Click Me"))
            formLayout.addRow(labelLis[i], comboList[i])
        groupBox.setLayout(formLayout)
        scroll = QScrollArea()
        scroll.setWidget(groupBox)
        scroll.setWidgetResizable(True)
        scroll.setFixedHeight(400)
        layout = QVBoxLayout(self)
        layout.addWidget(scroll)
        self.show()
App = QApplication(sys.argv)
window = Window(30)
sys.exit(App.exec())

class Widget(QWidget):

    def __init__(self, parent= None):
        super(Widget, self).__init__()
        self.setFixedHeight(200)

        #Container Widget
        widget = QWidget()
        #Layout of Container Widget
        layout = QVBoxLayout(self)
        for _ in range(20):
            btn = QPushButton("&quot;test&quot;")
            layout.addWidget(btn)
        widget.setLayout(layout)

        #Scroll Area Properties
        scroll = QScrollArea()
        scroll.setVerticalScrollBarPolicy(Qt.ScrollBarAlwaysOn)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setWidgetResizable(False)
        scroll.setWidget(widget)

        #Scroll Area Layer add
        vLayout = QVBoxLayout(self)
        vLayout.addWidget(scroll)
        self.setLayout(vLayout)

if __name__ == '__main__':
    app = QApplication(sys.argv)

    dialog = Widget()
    dialog.show()

    app.exec_()
