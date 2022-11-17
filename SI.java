/* Write a program to input principal, rate and time from the user and find
*  Simple Interest.
* */

import java.util.*;
public class SI {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the principal");
        int p = obj.nextInt();
        System.out.println("Enter the time");
        int t = obj.nextInt();
        System.out.println("Enter the rate");
        int r = obj.nextInt();

        int Si = (p*t*r/100);
        System.out.println("Your SI is "+Si);
    }
}
