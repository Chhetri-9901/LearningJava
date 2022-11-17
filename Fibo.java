

import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter you range");
        int range = obj.nextInt();

        System.out.println();
        int i = 0;
        int a=0, b=1, c;
        while(i < range) {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
            i++;
        }
//        int a=0, b=1, c;
//        for(int i = 1; i<range; i++) {
//            c = a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }
    }
}
