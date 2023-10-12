# Multiple inheritance


"""Multiple inheritance allows us to use the code from more than one parent class in a child class. If the same method is defined in multiple parent methods,
the child class will use the method of the first parent declared in its tuple list. """


class Calculation1:
    def sum(self, a,b):
        return a+b;

    def print(self, value):
        print("this is one", value)


class Calculation2:
    def multi(self, c,d):
        return c * d;

    def print(self, value):
        print("this si two", value)

class Calculation3(Calculation2,Calculation1):
    def divi(self, a,b):
        return a/b;


c = Calculation3()
print(c.sum(10,20))
print(c.multi(10,20))
print(c.divi(10,20))
print(c.print("ppp"))
