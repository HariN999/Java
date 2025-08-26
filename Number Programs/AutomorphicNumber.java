package Day3.Assignment;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;

        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int div = 1;
        for (int i = 0; i < digits; i++) {
            div *= 10;
        }

        int lastDigits = sq % div;

        if (lastDigits == n)
            System.out.println(n + " is Automorphic");
        else
            System.out.println(n + " is NOT Automorphic");
    }
}
