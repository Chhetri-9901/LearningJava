// Area of Triangle

import java.util.*;
public class AreaT {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the base of a triangle : ");
        int base = obj.nextInt();
        System.out.print("Enter the height of a triangle : ");
        int hi = obj.nextInt();

        float res = 0.5f*base*hi;
        System.out.println("Your area of the triangle is : "+ res);
    }
}
