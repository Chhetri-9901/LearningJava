// Take two numbers as input and print the largest number.

import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is a greater number.");
        } else
            System.out.println(num2 + " is a greater number.");
    }
}
