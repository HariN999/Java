package Day5;
import java.util.*;
public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = fibonacci(number);
        System.out.println("Fibonacci of " + number + " is " + result);
        for (int i=0; i<=number; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <=1) {
            return n;
        } else {
        
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
