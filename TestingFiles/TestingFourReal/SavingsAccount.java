package TestingFourReal;

/*
Write a program to handle deposits, withdrawals, and interest additions for a savings
account. This will require three classes: BankAccount (which is supplied on the
server), SavingsAccount, and SavingsAccountTest.
BankAccount is the superclass and SavingsAccount is a subclass. The SavingsAccount class requires instance
fields for a minimum balance and the interest rate. Also supply a constructor, an addInterest method, and a
toString method. The addInterest method will compute the interest to added to the account by multiplying the
minimum balance by the interest rate. The interest should then be deposited into the account. Each time the
addInterest method is called, reset the minimum balance to the current balance.
The subclass will need to override the withdraw method of the superclass since any withdrawal might force a change
in the minimum balance.
Supply a toString method to match the output shown below. The operations on the account are illustrated by the
output. Use the String.format or printf to format the numbers shown.
 */

 public class SavingsAccount extends BankAccount {
    private double minBalance;
    private double interestRate;
  
    public SavingsAccount(double balance, double minBalance, double interestRate) {
      super(balance);
      this.minBalance = minBalance;
      this.interestRate = interestRate;
    }
  
    public void withdraw(double amount) {
      if (super.getBalance() - amount < minBalance) {
        System.out.println("Error");
      } else {
        super.withdraw(amount);
      }
    }
  
    public void addInterest() {
      double interest = minBalance * interestRate;
      deposit(interest);
      minBalance = super.getBalance();
    }
  
    public String toString() {
      return String.format("Balance: $%.2f, Minimum balance: $%.2f, Interest rate: %.2f%%", getBalance(), minBalance,
          interestRate * 100);
    }
  }