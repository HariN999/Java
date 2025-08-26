package Day8;

import java.util.Arrays;
public class Array2D {
    public static void main(String[] args) {
        // int[][] array = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // // Print the 2D array
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int [][] arr  = new int[3][4];
        // arr[0][0]=1;
        // arr[0][1]=2;
        // arr[0][2]=3;
        // arr[0][3]=4;
        // arr[1][0]=5;
        // arr[1][1]=6;
        // arr[1][2]=7;
        // arr[1][3]=8;
        // arr[2][0]=9;
        // arr[2][1]=10;
        // arr[2][2]=11;
        // arr[2][3]=12;
        arr = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(arr.length); // no of rows
        System.out.println(arr[0].length); // no of columns
        for (int i =0; i<arr.length;i++){
            for (int j =0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }

}