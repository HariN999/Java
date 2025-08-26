package Day5;

import java.util.*;
public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {                               
            return (num % 10) + sumOfDigits(num / 10);
        }
    }
}
