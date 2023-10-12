# Method Overriding

class Animal:
    def eat(self):
        print("ANIMAL EAT")



class Dog(Animal):
    def eat(self):
        print("DOG EAT")

a= Dog()
a.eat()


