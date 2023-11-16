print("print all leap year between two given year")
startYear=int(input("Enter start year"))
endYear=int(input("Enter last year"))

print("List of  leap year")

for year in range(startYear,endYear):
    if(0==year%4) and (0!=year%100) or (0==year%400):
       print(year)
