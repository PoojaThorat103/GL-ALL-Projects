# Inheritance


class Animal:
    def animalEat(self):
        print("Animal - ")

#The child class Dog inherits the base class Animal

class Dog(Animal):
    def dogBark(self):
        print("Dog bark - ")

#The child class Dogchild inherits another child class Dog

class DogChild(Dog):
    def childCry(self):
        print("Dog Child - ")

d = DogChild()
d.animalEat()
d.dogBark()
d.childCry()
