// Take in two numbers and an operator (+ - / *) and calculate the value.

import java.util.*;
public class NumOp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter another number: ");
        int num2 = obj.nextInt();
        System.out.print("Choose your operator + - / * : ");
        String ope = obj.next();

        if(ope.equals("+")) {
            System.out.println(num1 + num2);
        } else if (ope.equals("-")) {
            System.out.println(num1 - num2);
        } else if (ope.equals("*")) {
            System.out.println(num1 * num2);
        } else if(ope.equals("/")) {
            System.out.println(num1 / num2);
        } else
            System.out.println("Enter a valid opertor");
    }
}
