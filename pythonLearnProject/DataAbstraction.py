class Animal :

    __age = 10 # can  not visible outside the class
    name = "aaa"
    def Cat (self):
        print("CAT-")
        print(self.name)
        print(self.__age)


class Zoo(Animal):
    def dog(self):
        print("Dog ---")
        print(self.name)
       # print(self.__age) Data abstraction : will give error

# #Data abstraction in python
# Abstraction is an important aspect of object-oriented programming. In python,
# we can also perform data hiding by adding the double underscore (___) as a prefix to the attribute which is to be hidden.
# After this, the attribute will not be visible outside of the class through the object.



z = Zoo()
z.Cat()
z.dog()

