package Recursion.Reverse;
    /*Write a recursive method void reverse() that reverses a sentence.

For example:

Sentence greeting = new Sentence(“Hello!”);

Greeting.reverse();

System.out.println(greeting.getText());

prints the string “!olleH”. Implement a recursive solution by removing the first character, reversing the sentence consisting of the remaining text, and combining the two.*/
public class Reverse {

        public static void main(String[] args) {
            Sentence greeting = new Sentence("Hello!");
            greeting.reverse();
            System.out.println(greeting.getName());
        }
    
   

}
