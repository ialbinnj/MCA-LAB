import random

randomInt=random.randint(1,100)
print("Random Integer:", randomInt)

randomFloat=random.random()
print("Random float between 0 and 1:",randomFloat)

myList=[1,2,3,4,5]
random.shuffle(myList)
print("Shuffled List:",myList)
