#   Method Overloading
    # it is not possible in python but using some tricks we can achieve it.
  #  we can use None consept, this is default argument so even we don't pass the value' the default value will be none.


class Calculation:

    def sum(self,a= None ,b = None,c = None):
        s=0

        if (a!= None and b != None and c!= None):
            s = a+b+c

        elif(a!= None and b!= None):
            s= a+b
        else:
            s=a

        return s

c1= Calculation()
print(c1.sum(10,20))


