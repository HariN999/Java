package Day1.Assignment;
import java.util.*;
public class NumberMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to check: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 0 || b < 0) {
            System.out.println("Invalid input. Enter positive integers.");
        } 
        else if (a % b == 0) {
            System.out.println(a + " is a multiple of " + b);
        } 
        else if (b % a == 0) {
            System.out.println(b + " is a multiple of " + a);
        } 
        else {
            System.out.println("Neither number is a multiple of the other.");
        }
        sc.close();                                   
    }
}
