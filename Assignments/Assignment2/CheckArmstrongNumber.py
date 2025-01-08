def calculateArmstrongSum(numberToCheck):
    sum = 0
    totalDigits = 0
    temporaryNumber = numberToCheck
    while temporaryNumber > 0:
        totalDigits += 1
        temporaryNumber //= 10
    temporaryNumber = numberToCheck

    while temporaryNumber > 0:
        currentDigit = temporaryNumber % 10
        sum += currentDigit ** totalDigits
        temporaryNumber //= 10

    return sum

def checkArmstrongNumber():
    userInputNumber = int(input("\nPlease Enter the Number to Check for Armstrong: "))

    if userInputNumber == calculateArmstrongSum(userInputNumber):
        print(f"\n{userInputNumber} is an Armstrong Number.\n")
    else:
        print(f"\n{userInputNumber} is Not an Armstrong Number.\n")


checkArmstrongNumber()