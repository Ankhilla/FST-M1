fruits = {
    "apple":10,
    "banana":20,
    "grapes":30
}
print(fruits)
check_available = input("whitch fruit your searching for:").lower()
if (check_available in fruits):
    print("fruit is  available")
else:
    print("fruit not available")    
