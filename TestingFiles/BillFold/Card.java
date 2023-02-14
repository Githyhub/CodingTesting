package BillFold;

public class Card {
    private String name;

    public Card(){
        name ="";
    }

    public Card(String n){
        name = n;
    }

    public String getName(){
            return name;
    }

    public boolean isExpired(){
            return false;
    }

    public String format(){
        return "Card Holder: " + name;
    }

    public String toString(){
        return (name);
    }

    public boolean equals(Object compar){
        Card temp = (Card)compar;
            if (this.name.equals(temp.name)){
                return true;
            }
            else{
                return false;
            }
    }

}
