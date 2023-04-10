package Recursion;

//Write a countDown(int number) method in Java using Recursion which prints countdown till zero to console, like count(3) should print 3 2 1 0

public class countDown {

    public static String count(int number){
        if (number >0){
        return ( number +" "+ count(number-1) );
        }
        else{
            return Integer.toString(number); 
        }
      
    }

    public static void main(String[] args) {
       System.out.print(count(100));
    }
    

}


