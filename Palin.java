//Palindrome String

import java.util.*;
public class Palin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = obj.next();
        String revword = "";
        int length = word.length();

        for(int i=(length-1); i>=0; --i) {
            revword = revword + word.charAt(i);
        }
        if(word.equalsIgnoreCase(revword)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not a palindrome");
    }
}
