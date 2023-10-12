
# x= a + bj
# Here a is real part and b is  Imaginary part
#
# The complex data type in python consists of two values, the first one is the real part of the
# complex number, and the second one is the imaginary part of the complex number.For example, (3 + 7j)

class DataTest:

    def data(self):
        x= 10 + 20j
        y = 20 +30j
        print (type(x))
        print(x.real)
        print(x.imag)
        print(x+y)

c1 = DataTest()
c1.data()
