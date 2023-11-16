def findLongestWord(wordList):
     longestWord= ""
     for word in wordList:
          if len(word)>len(longestWord):
               longestWord=word
     return len(longestWord)
     
wordList=input("Enter a list of words separated by spaces: ").split()

print("Length of the longest word: ",findLongestWord(wordList))
