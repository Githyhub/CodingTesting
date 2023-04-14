package Recursion.findWord;

public class findWord {
    private String textTemp;

    public findWord(String text ){
        textTemp= text;
    }

    public boolean find(String temp){
        if (textTemp.startsWith(temp)){
            return true;
        }
        else if (textTemp.length()==0){
            return false;
        }
        else{
            findWord twn= new findWord(textTemp.substring(1));
            return twn.find(temp);
        }
    }
}
