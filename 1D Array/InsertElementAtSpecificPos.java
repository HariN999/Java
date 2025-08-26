package Day7;

import java.util.Scanner;

public class InsertElementAtSpecificPos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1]; // New array with extra space
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter the position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();
        sc.close();
        if(pos < 0 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }
        for(int i = n; i > pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;

        System.out.println("Array after insertion: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
