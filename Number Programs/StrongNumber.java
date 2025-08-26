package Day3.Assignment;

import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is a Strong Number");
        else
            System.out.println(n + " is NOT a Strong Number");
    }
}
