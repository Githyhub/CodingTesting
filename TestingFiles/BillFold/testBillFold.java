package BillFold;

public class testBillFold {
   
    public static void main(String args[]){
        String name = "slay";
        BillFold b1 = new BillFold();
       
        Card call = new CallingCard(name, 200003,2034);
        Card drive = new DriversLicence(name,2034);
        Card id = new idCard(name, "uUuu0182");

        b1.addCard(call);
        b1.addCard(drive);

       System.out.print( b1.formatCards());
    }
}
