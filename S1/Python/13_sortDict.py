myDict = {"one": 1, "three": 3, "five": 5, "two": 2, "four": 4}

#sorting ascending order by keys
sortDictAcc = dict(sorted(myDict.items()))
print("Dictionary in ascending order by keys: ", sortDictAcc)

#sorting deascending order by keys
sortDictDes = dict(sorted(myDict.items(),reverse=True))
print("Dictionary in desascending order by keys: ", sortDictDes)


#sorting ascending order by value
sortDictAccVal = dict(sorted(myDict.items(),key=lambda item:item[1]))
print("Dictionary in ascending order by Value: ",sortDictAccVal)

#sorting deascending order by keys
sortDictDesVal = dict(sorted(myDict.items(),key=lambda item:item[1],reverse=True))
print("Dictionary in desascending order by Value: ",sortDictDesVal)
