a = int(input("a = "))

num = 1
for i in range(a):
    if i < a - 1:
        print(num, end=", ")
    else:
        print(num)
    num += 2
