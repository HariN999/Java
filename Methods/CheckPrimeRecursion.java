package Day5.Assignment;
import java.util.*;
public class CheckPrimeRecursion {
    static boolean isPrime(int n, int i) {
        if (n == 0 || n == 1) {
            return false; 
        }
        if(n == 2) {
            return true; 
        }
        else if (n % i == 0) {
            return false; 
        }
        else if (i * i > n) {
            return true; 
        }
        return isPrime(n, i + 1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (isPrime(n, 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
