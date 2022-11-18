//Given an integer number n,
// return the difference between the product of its digits and the sum of its digits.


import java.util.*;
public class ProSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = obj.nextInt();
        int temp = num;
        int product =1;
        int sum = 0;

        for(int i=0; i<=temp;i++) {
           int lastval = temp%10;
           product = lastval * product;
           sum = sum + lastval;
           temp = temp/10;
        }
        System.out.println("Product is " + product);
        System.out.println("Sum is " + sum);

        if(product > sum) {
            System.out.println("The difference between them is : " + (product - sum));
        } else
            System.out.println("The value of the product is less than the sum");
    }
}
