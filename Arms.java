//Armstrong numbers between the two

import java.util.*;
public class Arms{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int temp = num1;
        int temp2 = num2;


        int top,top1,total1=0, total2 =0;

        while(num1 != 0) {
            top1 = num1%10;
            total1 = total1 + top1*top1*top1;
            num1=num1/10;
        }
        while(num2 != 0) {
            top = num2%10;
            total2 = total2 + top*top*top;
            num2=num2/10;
        }
        if(temp == total1) {
            System.out.println(temp +" is an armstrong number");
        } else if (temp2 == total2) {
            System.out.println(temp2 +" is an armstrong number");
        } else
            System.out.println("Both are not armstrong number");
    }
}