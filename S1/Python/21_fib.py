def fib(n):
     fibSeries=[]
     a,b=0,1
     for _ in range(n):
          fibSeries.append(a)
          a,b=b,a+b
     return fibSeries
    
n=int(input("Enter a number"))
print("Fibonacci series of",n,"terms: ",fib(n))
