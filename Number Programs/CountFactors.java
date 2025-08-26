package Day3.Assignment;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) count++;   
                else count += 2;           
            }
        }
        System.out.println("Number of factors: " + count);
    }
}

