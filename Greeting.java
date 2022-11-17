//Take name as an input and print a greeting message for that particular name.

import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.next();
        System.out.println(name + " Hello" );
    }
}
