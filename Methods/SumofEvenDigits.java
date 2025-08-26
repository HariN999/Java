package Day5;

import java.util.Scanner;
public class SumofEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = sumOfEvenDigits(num);
        System.out.println("Sum of even digits is: " + sum);
        sc.close();
    }

    public static int sumOfEvenDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            int digit = num % 10;
            if (digit % 2 == 0) {
                return digit + sumOfEvenDigits(num / 10);
            } else {
                return sumOfEvenDigits(num / 10);
            }
        }
    }
}