# Syntax :
#[expression for var in sequence if-condition]



list1 = [1,2,3,4,5,6,7,8]
list2=[n for n in list1 if n%2==0]
print(list1)
print(list2)


names =["pooja","nama","sahil","vahini"]
names2 =[n for n in names if n.startswith('v')]
print(names2)


sales = [100,200,300,500,400,700]
sales1 = [n for n in sales if n>500]
print(sales1)
