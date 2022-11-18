// Area of Equilateral triangle

import java.util.*;
public class AreaEqui {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the side value.");
        int a = obj.nextInt();

        double res = (Math.sqrt(3)/4)*a*a;
        System.out.println(res);
        System.out.println("The perimeter is : " +3*a);
    }
}
