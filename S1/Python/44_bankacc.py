class BankAccount:
      def __init__(self,accountNumber,accountHolderName,accountType,balance=0.0):
            self.accountNumber=accountNumber
            self.accountHolderName=accountHolderName
            self.accountType=accountType
            self.balance=balance
            
      def deposit(self,amount):
            if(amount>0):
                 self.balance+=amount
                 print(f"Deposit of ${amount} successful. New balance: ${self.balance}")
            else:
                print("Invalid deposit amount. Please enter a positive value.")
      
      def withdraw(self,amount):
          if 0 < amount <= self.balance:
             self.balance -= amount
             print(f"Withdrawal of ${amount} successful. New balance:${self.balance}")
          else:
             print("Invalid withdrawal amount or insufficient funds.")
             
      def display_account_info(self):
           print(f"Account Number: {self.accountNumber}")
           print(f"Account Holder: {self.accountHolderName}")
           print(f"Account Type: {self.accountType}")
           print(f"Current Balance: ${self.balance}")
           
account1=BankAccount("123456","John Doe","savings",1000.0)
account1.display_account_info()
account1.deposit(500.0)
account1.withdraw(200.0)       
account1.display_account_info()
