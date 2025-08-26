package Day5;

import java.util.*;
public class ProductOfDigits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int product = productOfDigits(num);
        System.out.println("Product of digits is: " + product);
        sc.close();
    }

    public static int productOfDigits(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num % 10) * productOfDigits(num / 10);
        }
    }
}
