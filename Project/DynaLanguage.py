print("******************Part1(Polymorphism)**********************")
class addTwoNum:
    def __init__(self,x,y):
        self.x=x
        self.y=y

    def add(self):
        result=self.x+self.y
        return result


class addThreeNum:
    def __init__(self,x,y,z):
        self.x=x
        self.y=y
        self.z=z

    def add(self):
        result=self.x+self.y+self.z
        return result

addTwoNum=addTwoNum(3,5)
print(addTwoNum.add())

addThreeNum=addThreeNum(3,4,5)
print(addThreeNum.add())

print("******************Part2(Encapsulation)**********************")
class product:
    def __init__(self,name1,name2):
        self.name1=name1
        self._name2=name2

    def getProductName(self):
        return self._name2

product=product("My Product1","My Product2")

productName1=product.name1
print(productName1)

productName2=product.getProductName()
print(productName2)

print("******************Part3(Abstraction)**********************")
from abc import ABC, abstractmethod
class PersonInfo(ABC):
    @abstractmethod
    def name(self):
        pass
    @abstractmethod
    def emailAddress(self):
        pass

class Person1:
    def name(self):
        print("This is person1")
    def emailAddress(self):
        print("Person1 email address: person1@gmail.com")

class Person2:
    def name(self):
        print("This is person2")
    def emailAddress(self):
        print("Person2 email address: person2@gmail.com")


P1=Person1()
P1.name()
P1.emailAddress()
