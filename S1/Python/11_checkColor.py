colorList1=["Red","Green","Blue","White","Orange"]
colorList2=["Green","Orange","Black","White"]

res=[color for color in colorList1 if color not in colorList2]

print("Colors from colorList1 not contained in colorList2: ",res)
