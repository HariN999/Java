package Day7;

import java.util.Scanner;

public class ReplaceNegNumbersWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println("Array after replacing negative numbers with zero: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
