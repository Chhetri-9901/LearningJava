// Area of Isosceles Triangle

import java.util.*;
public class AreaIT {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a side of the triangle a = " );
        int a = obj.nextInt();
        System.out.print("Enter another side of the triangle b = ");
        double b = obj.nextInt();
        System.out.println((b*b)/4);

        double res = 0.5*(Math.sqrt(a*a)) - ((b*b)/4)*b;
        System.out.println(res);
    }
}
