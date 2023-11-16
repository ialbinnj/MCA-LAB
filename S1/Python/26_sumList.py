numbers=input("Enter a list of numbers seperated by spaces: ")

numberList=[int(x) for x in numbers.split(" ")]

totalSum=sum(numberList)
print("Sum of all items in the list: ",totalSum)
