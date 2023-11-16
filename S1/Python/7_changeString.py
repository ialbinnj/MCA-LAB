def changeStringValue(value):
    return value[-1:]+value[1:-1]+value[:1]
    
print(changeStringValue("abcd"))
print(changeStringValue("12345"))
