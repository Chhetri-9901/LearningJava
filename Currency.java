//Input Currency in rupees and output in USD.

import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Choose your currency D or R.");
        String curr = obj.next();

        if(curr.equalsIgnoreCase("D")) {
            System.out.print("Enter you amount: ");
            int amount = obj.nextInt();
            double val = amount*81.74;
            System.out.print("Your amount in Rupees is : " +val);
        }
        else {
            System.out.print("Enter you amount: ");
            int amount = obj.nextInt();
            double val = amount/81.74;
            System.out.print("Your amount in Dollar is : " +val);
        }
    }
}
