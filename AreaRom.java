// Area of Rhombus

import java.util.*;
public class AreaRom {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the diagonals value.");
        int d1 = obj.nextInt();
        int d2 = obj.nextInt();

        double area = (d1*d2)/2;
        System.out.println("The area of Rhombus " +area );
    }
}
