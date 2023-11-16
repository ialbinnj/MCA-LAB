str1=input("Enter the first string: ")
str2=input("Enter the second string: ")

if len(str1)>0 and len(str2)>0:
     newstr1=str2[0]+str1[1:]
     newstr2=str1[0]+str2[1:]
     res=newstr1+" "+newstr2
     print("Result: ",res)
else:
     print("Both string must have at least on character")
