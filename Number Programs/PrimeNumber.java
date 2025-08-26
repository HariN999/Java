package Day3;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void Prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        
        System.out.println(n + " is a prime number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Prime(num);
        
    }
}
