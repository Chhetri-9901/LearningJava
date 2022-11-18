//Input a number and find all the factors of it.

import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = obj.nextInt();

        for(int i=1; i<=num;i++) {
            if(num%i == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
