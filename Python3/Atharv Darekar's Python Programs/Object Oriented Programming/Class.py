class Class: #defines a class
    attribute1 = "attribute1" #snippet 1
    attribute2= 2
    def function(self): #defines a function
        self.attribute3=3.0
        self.attribute4='4'
    def functionAdd(self, arg1, arg2):
        self.arg1=arg1
        self.arg2=arg2
        print(arg1+arg2)
#An alternate for snippet 1
# obj_Class.attribute1 = "attribute"
# obj_Class.attribute2= 2

obj_Class=Class() #generates an object of the class
obj_Class.function() #calls the function
print(obj_Class) #prints memory location of the object
print("Attribute 1 = " + obj_Class.attribute1) #accessing the attributes of a class via objects
print("Attribute 2 = "+ str(obj_Class.attribute2))
print("Attribute 3 = "+ str(obj_Class.attribute3))
print("Attribute 4 = "+ obj_Class.attribute4)
obj_Class.functionAdd(2,3)
obj_Class.functionAdd("Atharv ","Darekar") #dynamic type casting

#python handles everything as an object
