package Day3;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b=1;
        System.out.print("Fibonacci sequence: ");
        for(int i =1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;
            sc.close();
        }
    }
}

