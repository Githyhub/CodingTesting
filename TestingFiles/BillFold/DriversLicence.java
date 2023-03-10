package BillFold;
import java.util.Calendar;


public class DriversLicence extends Card {
    private int expYear;

    public DriversLicence(String name, int exp){
        super.NameCard(name);
        expYear=exp;
    }
    
    public String format(){
        return super.format() + " " + expYear;

    }
    public boolean isExpired(){
        Calendar current = Calendar.getInstance();
        int currentYear= current.get(Calendar.YEAR);
        if (expYear>currentYear){
            return true;
        }
        else{
            return false;
        }
        
    }

    public String toString(){
        return (super.NameCard() + expYear );
    }

}
