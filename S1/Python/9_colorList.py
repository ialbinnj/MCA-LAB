colorsName=input("Enter color names: ")

colors=colorsName.split(",")

colors=[color.strip() for color in colors]

if len(colors)>=2:
     print("First color: ",colors[0])
     print("last color: ",colors[-1])
else:
     print("Please enter at least two color names.")
