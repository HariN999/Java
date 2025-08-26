package Day1;
import java.util.*;
public class DivisibleBy3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println( "It  is Divisible");
        } else {
            System.out.println(" It is not Divisible");
        }
        sc.close();
    }
}
