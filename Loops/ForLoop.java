package Day2;

import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i =1; i<=num; i++)
            System.out.println(i);
        
        sc.close();
    }
}