def fact(n):
     factorial=1
     for i in range(1,n+1):
          factorial*=i
     return factorial

#Recursion

def factRec(n):
     if n==0:
          return 1
     else:
          return n*factRec(n-1)
          
num=int(input("Enter a number"))
print("Res: ",fact(num))
print("Res using Recursion: ",factRec(num))
