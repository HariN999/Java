package Day8;
import java.util.*;
public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r = sc.nextInt();
        System.out.print("Enter number of columns :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[r][c];
        System.out.println("Enter elements for the second array:");
        for(int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
       int[][] sumArray = new int[r][c];
       for(int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               sumArray[i][j] = arr[i][j] + arr2[i][j];
           }
       }
       System.out.println("Sum of both arrays:");
       for(int i = 0; i < sumArray.length; i++) {
           for (int j = 0; j < sumArray[i].length; j++) {
               System.out.print(sumArray[i][j] + " ");
           }
           System.out.println();
       }
       sc.close();
    }
}
