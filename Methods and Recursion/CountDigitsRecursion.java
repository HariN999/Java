package Day5;

import java.util.Scanner;
public class CountDigitsRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is " + count);
        sc.close();
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
