

import java.util.*;
public class SumLarge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num;
        int res = 0;
        int large = 0;

        while((num = obj.nextInt()) != 0) {
                res = res + num;

                if(num > large) {
                    large = num;
                }
            System.out.println("Press 0 to see the sum of all the numbers and the largest number");
        }

        System.out.println("The sum is "+res);
        System.out.print("The largest number is "+large);
    }
}
