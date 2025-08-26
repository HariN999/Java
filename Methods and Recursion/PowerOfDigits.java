package Day5;
import java.util.*;
public class PowerOfDigits {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1; 
        } else {
            return base * power(base, exp - 1); 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        sc.close();
        int result = power(base, exp);
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
    }
    
}