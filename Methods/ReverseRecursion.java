package Day5;

import java.util.Scanner;

public class ReverseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("Reversed number is: ");
        reverseNumber(num);
        sc.close();
    }

    public static void reverseNumber(int num) {
        if (num < 10) {                                                           
            System.out.print(num);
        } else {
            System.out.print(num % 10);
            reverseNumber(num / 10);
        }
    }
}                                                                                                                                                                                                                                                                                                                              
