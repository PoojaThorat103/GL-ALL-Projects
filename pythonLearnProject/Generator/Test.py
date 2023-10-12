
def valueFun():
    yield 1
    yield 2
    yield 3

val = valueFun()

print(val.__next__())
print(val.__next__())
print(val.__next__())

for n in valueFun():
    print(n)

