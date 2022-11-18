// Area of Parallelogram

import java.util.*;
public class AreaP {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = obj.nextInt();
        System.out.println("Enter the height");
        int height = obj.nextInt();

        int res = base * height;
        System.out.println("The area of your parallelogram is: " + res);
        System.out.println("The perimeter of the parallelogram is "+2*(base+height));
    }
}
