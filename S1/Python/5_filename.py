filename=input("Enter filename wit extension: ")

if "." in filename:
     name,ext=filename.split(".")
     print("Extension is :"+ext)
else:
     print("Invalid filename")
