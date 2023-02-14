package BillFold;

public class BillFold {
    private Card card1;
    private Card card2;

    public BillFold(){
        card1 = null;
        card2= null;
    }
    public void addCard(Object temp){
       Card tempFixed = (Card)temp;
       if(card1==null){
            card1=tempFixed;
       }
       if(card2==null){
            card2=tempFixed;
       }

    }
    public String formatCards(){
        if ((card1!=null)&&(card2!=null)){
            return (card1.format()+ card2.format());
        }
        else{
            return null;
        }
    }

    public int getExpiredCardCount(){
        int count = 0;
        if (!((card1 == null) || (card2 == null)))
        {
            if (card1.isExpired())
            {
                count++;
            }
            else if (card2.isExpired())
            {
                count++;
            }
        }
        return count;
    }
}
