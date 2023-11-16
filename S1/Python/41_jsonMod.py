import json

data={
     "name":"John",
     "age":30,
     "city":"New York"
}

jsonData=json.dumps(data,indent=4)
print("JSON DATA:")
print(jsonData)

jsonString='{"name":"Alice","age":25,"city":"London"}'
parsedData=json.loads(jsonString)

print("Parsed Data:")
print(parsedData)
