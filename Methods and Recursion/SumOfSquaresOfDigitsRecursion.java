package Day5.Assignment;
import java.util.*;
public class SumOfSquaresOfDigitsRecursion {
    static int sumOfSquares(int n) {
        if (n == 0) {
            return 0; 
        } else {
            int digit = n % 10; 
            return digit * digit + sumOfSquares(n / 10); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int result = sumOfSquares(n);
        System.out.println("The sum of squares of the digits of " + n + " is: " + result);
    }
}
