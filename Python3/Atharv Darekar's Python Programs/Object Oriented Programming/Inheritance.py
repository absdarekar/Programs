class ParentParent(): #super parent class
    def __init__(self,atrb1,atrb2,atrb3):
        self.atrb1=atrb1
        self.atrb2=atrb2
        self.atrb3=atrb3
    def function_ParentParent(self):
        print(self.atrb1)
        print(self.atrb2)
        print(self.atrb3)

class Parent(ParentParent): #child class inheriting a parent class
    def __init__(self):
        super().__init__("One","Two","Three") #calls the __init__ function of parent class
class Child(Parent): #child class
    def __init__(self):
        super().__init__()
        self.function_ParentParent()
        ParentParent.__init__(self,"Uno","Dos","Tres") #calls the __init__ function of specified class
        self.function_ParentParent()
obj_Child=Child() #calling function from parent class
print(Child.__mro__) #prints method resolution order i.e. the order in which methods are called inside the child class

#first all the methods from child class are executed then methods of the parent class are executed
#this rule is followed for multiple inheritance
