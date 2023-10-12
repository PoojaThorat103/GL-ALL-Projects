class Animal:

# else Block, and raise keyword


#     def info(self):
#         a=10
#         b=20
#
#         try:
#          print(a/b)
#
#         except Exception as e:
#             print("Error : ",e)
#
#         else:
#             print("No error")
#
# c = Animal()
# c.info()


# Note : The raise keyword is used to raise an exception.  You can define what kind of error to raise, and the text to print to the user.


 def info(self):
        a=40
        b=20
        if(a>b):
            raise Exception("a is greater")
c= Animal()
c.info()
