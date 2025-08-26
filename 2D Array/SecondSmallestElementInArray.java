package Day8;

import java.util.Scanner;

public class SecondSmallestElementInArray {
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

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i][j];
                } else if (arr[i][j] < secondSmallest && arr[i][j] != smallest) {
                    secondSmallest = arr[i][j];
                }
            }
        }

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest element in the array: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found.");
        }

        sc.close();
    }
}
