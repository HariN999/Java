package Day2.Assignment;

import java.util.*;

public class SumOfDigits {

    public static int countDigits(int n) {
        if (n == 0) return 1;  
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n / 10;   
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
