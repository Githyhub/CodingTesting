package InheratanceUnit.SavingAccount;

class SavingsAccount extends BankAccount {
    double interestRate;
    double minimumBalance;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
        this.minimumBalance = balance;
    }

    public void addInterest() {
        double interest = minimumBalance * interestRate / 100;
        deposit(interest);
        minimumBalance = getBalance();
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < minimumBalance) {
            minimumBalance = getBalance();
        }
    }

    public String toString() {
        return String.format("Balance: $%.2f        Rate: %.1f%%    Minimum Balance: $%.2f", 
                             getBalance(), interestRate, minimumBalance);
    }
}

