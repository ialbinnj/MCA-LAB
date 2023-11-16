def sumBySqure(n):
     st=0
     for i in range(n+1):
          st=i*2
     return st
     
n=int(input("Enter a number: "))
print("Sum of squre of first n natural number",sumBySqure(n))
