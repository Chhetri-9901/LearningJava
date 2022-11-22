// Find vowels and consonant

import java.util.*;
public class VolConso {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = obj.next();
        int len = word.length();
        char ch;
        String find ="", rest ="";
        for(int i=0; i<=(len-1); i++) {
            ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' || ch == 'U') {
//                System.out.println("The vowels are " + ch);
                find = ch+find;
            }
            else {
                // System.out.println("The consonant are " + ch);
                rest = ch + rest;
            }
        }
        System.out.println("The vowels ara " +find);
        System.out.println("The consonant are "+ rest);
    }
}
