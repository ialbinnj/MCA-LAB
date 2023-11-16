def isEven(n):
    return all(int(dig) % 2 == 0 for dig in str(n))
    
def isPerfect(n):
    root = int(n ** 0.5)
    return root * root == n

startRange = int(input("Enter the starting number of the range (four digits): "))
endRange = int(input("Enter the ending number of the range (four digits): "))

result = [num for num in range(startRange, endRange + 1) if isEven(num) and isPerfect(num)]

print("List of four-digit numbers with all even digits and perfect squares:", result)

