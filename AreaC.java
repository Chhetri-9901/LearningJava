// Area of a circle in Java

import java.util.*;
public class AreaC {
       static double pi = 3.14;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        int rad = obj.nextInt();
        double seri = pi*rad;
        double ans = seri*rad;
        System.out.println("The area of a circle is : " + ans);
        System.out.println("The perimeter of a circle is : " +2*seri);


    }
}
