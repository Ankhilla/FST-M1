num_tuple = (1, 5, 10, 15, 2, 6, 8)
print(type(num_tuple))
print("enter the num divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)
        