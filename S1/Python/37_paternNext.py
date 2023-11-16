numRow=9
for i in range(1,numRow+1):
     numStar=min(i,numRow-i+1)
     
     for j in range(numStar):
          print("*",end=" ")
     print()
