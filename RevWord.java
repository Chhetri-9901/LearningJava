//Reverse a string

import java.util.*;
public class RevWord {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = obj.nextLine();
        int len = word.length();
        String revword = "";
        char ch;
        for(int i =0 ; i<=(len-1); i++) {
            ch = word.charAt(i);
            revword = ch + revword;
        }
        System.out.println("The reverse word is: " + revword);
    }
}
