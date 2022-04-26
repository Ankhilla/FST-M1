from unittest import result


def Sum(num):
    if num:
        return num + Sum(num - 1)
    else:
        return 0

result = Sum(10)
print(result)
