from datetime import datetime,timedelta

currentTime=datetime.now()
print("Current Date and Time:",currentTime)

daysToAdd=7
futureDate=currentTime+timedelta(days=daysToAdd)
print("Date after",daysToAdd,"days:",futureDate)
