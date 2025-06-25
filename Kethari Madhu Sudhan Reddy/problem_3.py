a = int(input("a = "))
if a % 2 == 0:
    a = a - 1
num = 1
for i in range(a):
    if i < a - 1:
        print(num, end=", ")
    else:
        print(num)
    num += 2
