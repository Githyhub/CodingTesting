package BillFold;

public class Card {
    private String name;

    public void Card(){
        name ="";
    }

    public void NameCard(String n){
        name = n;
    }
    public String NameCard(){
       return name;
    }

    public String getName(){
            return name;
    }

    public boolean isExpired(){
            return false;
    }

    public String format(){
        return "Card Holder: " + name + " ";
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
