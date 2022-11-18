// Area of Rectangle

import java.util.*;
public class AreaR {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = obj.nextInt();
        System.out.println("Enter the breath");
        int bre = obj.nextInt();
        int res = len * bre;
        int peri = 2*(len + bre);
        System.out.println("Your area for rectangle is : " + res);
        System.out.println("Your perimeter is :" + peri);
    }
 }
