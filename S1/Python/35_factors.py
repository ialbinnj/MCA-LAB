def findFactors(value):
     factors=[]
     for i in range(1,value+1):
          if value%i==0:
               factors.append(i)
     return factors
     
num = int(input("Enter a numbers: "))

print("Factors of",num,"are: ",findFactors(num))
