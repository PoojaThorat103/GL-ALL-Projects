class EcpTest:
# Try, Except, Finally





    def calculation(self):
        value = 100
        value2 = 0

        # k = int(input("Enter a Name"))
        # print(k)

        try:
         print(value/value2)


        except ZeroDivisionError as e:
            print("Got exception :  ", e)

        except ValueError as c:
            print("Got error  :  ", c)

        finally:
            print("This is Finally")



c = EcpTest()
c.calculation()

