// Average of N numbers

import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the range ");
        int ran = obj.nextInt();
        int sum = 0;
        double avg;
        for(int i=0; i<ran; i++) {
            System.out.print("Enter your number ");
            int num = obj.nextInt();
            sum = sum + num;
        }
        avg = sum/ran;
        System.out.println("The average is " + avg);
    }
}
