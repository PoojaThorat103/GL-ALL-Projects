
#

my_dict = {
    "name" : "pooja",
    "surname" : "thorat",
    "age" : 28
}

print(my_dict)
print(my_dict["age"]) # Get value
print(my_dict.get("name")) # Get value



my_dict["age"]=25 # Changing value
print(my_dict)

my_dict.pop("age") # Delete specific element
print(my_dict)


