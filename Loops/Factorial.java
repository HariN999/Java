package Day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int product =1;
        for(int i=n; i>=1; i--) // (int i=1; i<=n; i++)
            product *=i;
        System.out.println("Factorial of "+ n +" is "+product);
        sc.close();
    }
}
