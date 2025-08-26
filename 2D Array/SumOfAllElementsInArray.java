package Day8;

import java.util.Scanner;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r = sc.nextInt();
        System.out.print("Enter number of columns :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;               
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all elements in the array: " + sum);
        sc.close();
    }
    
}
