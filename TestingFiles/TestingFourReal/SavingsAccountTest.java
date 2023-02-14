package TestingFourReal;

import javax.swing.JOptionPane;

public class SavingsAccountTest 
{
  public static void main(String[] args)
  {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter the starting balance:"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest rate (as a decimal):"));
        double minBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter the minimum balance:"));
    
        SavingsAccount account = new SavingsAccount(balance, minBalance, interestRate);
    
        String input = JOptionPane.showInputDialog("Enter D for deposit, W for withdrawal, I for interest addition, or Q to quit:");
            while (!input.equals("Q")) {
                if (input.equals("D")) {
                    double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the deposit amount:"));
                    account.deposit(depositAmount);
                } else if (input.equals("W")) {
                    double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the withdrawal amount:"));
                    account.withdraw(withdrawAmount);
                } else if (input.equals("I")) {
                    account.addInterest();
                }
                JOptionPane.showMessageDialog(null, "Account status:\n" + account.toString());
                input = JOptionPane.showInputDialog("Enter D for deposit, W for withdrawal, I for interest addition, or Q to quit:");
            }
      }
    }
  
