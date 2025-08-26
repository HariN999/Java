package Day2;

import java.util.*;
public class Reverse {

    public static void rev(int n ){
            for (int i =n; i>=1; i--)
                System.out.println(i);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        rev(n);
        sc.close();
    }
}
