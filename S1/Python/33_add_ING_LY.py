def add_ing_ly(value):
     if(value.endswith('ing')):
          result=value+'ly'
     else:
          result=value+'ing'
     return result

inputValue=input("Entera string: ")
print("Modified String: ",add_ing_ly(inputValue))
