List1 = [1,2,3,4,5]
List2 = [3,8,9,4,5]
print("Firstlist:", List1)
print("Secondlist:", List2)
thirdList = []

for num in List1:
    if (num % 2 == 0):
        thirdList.append(num)
for num in List2:        
    if (num % 2 != 0):
        thirdList.append(num) 
print("result of ThirtdList:") 
print(thirdList)       


