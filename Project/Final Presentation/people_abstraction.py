from abc import ABC, abstractclassmethod
class PersonInfo(ABC):
    @abstractclassmethod
    def name(self):
        pass
    @abstractclassmethod
    def email(self):
        pass

class Person1:
    def name(self):
        print("this is person1")
    def email(self):
        print("Person1 email: person1@gmail.com")

class Person2:
    def name(self):
        print("this is person2")
    def email(self):
        print("Person2 email: person2@gmail.com")
