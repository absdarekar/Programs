class Constructor:
    def __init__(self,attribute1,attribute2,attribute3): #initiates the objects, equivalent to a constructor
        self.attribute1=attribute1
        self.attribute2=attribute2
        self.attribute3=attribute3
    def function1(self):
        print("Attribute 1 = "+self.attribute1)
    def function2(self):
        print("Attribute 2 = "+self.attribute2)
    def function3(self):
        print("Attribute 3 = "+str(self.attribute3))
obj_Constructor1=Constructor(1,2,3) #calling constructor
obj_Constructor2=Constructor("One","Two","Three")
obj_Constructor3=Constructor("Uno","Dos","Tres")
obj_Constructor1.function3()
obj_Constructor2.function2()
obj_Constructor3.function1()
