package Day4;

import java.util.*;
public class RightTriangle {
    
    static void printtriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printtriangle(rows);
    }
}
