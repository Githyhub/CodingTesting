package InheratanceUnit.SavingAccount;

import javax.swing.JOptionPane;

class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(2000, 4);
        System.out.println("Initial account:");
        System.out.println(account);
        Boolean opinionContinue = true; 

        String[] options = new String[] {"Print","Withdraw" ," Intrest "};
    

while (opinionContinue){
    int response = JOptionPane.showOptionDialog(null, "What do you want to do with the ArrayList", "Array program",
    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
    null, options, options[0]);
 switch (response){
    case -1:
     opinionContinue=false;
    break;
    case 0: 
    JOptionPane.showMessageDialog(null,account.toString());

    break;
        
   case 1:  
    account.withdraw(Double.parseDouble(JOptionPane.showInputDialog("How much wicthdarw")));
   break;
        
   case 2:  
      account.addInterest();;
            break;

        }

    }
    }
}