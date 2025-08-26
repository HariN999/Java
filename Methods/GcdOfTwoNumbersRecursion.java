package Day5.Assignment;
import java.util.*;
public class GcdOfTwoNumbersRecursion {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(a, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
    }
}