package BillFold;

import java.util.jar.Attributes.Name;

public class idCard extends Card{
    private String idNumber;

    public idCard(String name, String id){
        super.Card(name);
        idNumber=id;
    }

    public String format(){
        return super.format() + idNumber;

    }
    
    public String toString(){
        return (super.Card(Name) + idNumber );
    }

}
