package BillFold;

public class CallingCard extends Card {
    private int cardNumber;
    private int pin;

    
    public CallingCard(String name, int cardNumber, int pin){
        super.Card(name)=name;
        this.cardNumber=cardNumber;
        this.pin =pin;
    }

    public String format(){
        return super.format() + cardNumber + pin;

    }

    public String toString(){
        return (super.Card(Name) + cardNumber + pin );
    }
    
}
