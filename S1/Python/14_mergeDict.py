dict1={'a':1,'b':2}
dict2={'b':3,'c':4}

mergedDict = dict1.copy()
mergedDict.update(dict2)

print("Merged Dictionary(using update()): ",mergedDict)

dict1={'a':1,'b':2}
dict2={'b':3,'c':4}


mergedDict={**dict1,**dict2}
print("Merged Dictionary (using dictionary unpacking): ",mergedDict)
