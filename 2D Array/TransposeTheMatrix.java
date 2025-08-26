package Day8;

import java.util.Scanner;

public class TransposeTheMatrix {
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

        int[][] transposed = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
