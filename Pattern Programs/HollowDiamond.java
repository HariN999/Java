package Day4;
import java.util.*;
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        printHollowDiamond(n);
    }

    static void printHollowDiamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j < (2 * i - 2); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j < (2 * i - 2); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
