inputString=input("Enter a string: ")

charFreq={}

for char in inputString:
     charFreq[char]=charFreq.get(char,0)+1
     
print("Character frequencies in the string: ")

for char, frequency in charFreq.items():
     print("'{}':'{}'".format(char, frequency))
