package Day7;

import java.util.Scanner;

public class DeleteSpecificElementFromArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to delete: ");
        int elementToDelete = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++){
            if(arr[i] == elementToDelete){
                arr[i] = 0; 
            }
            if (arr[i]==0){
                for(int j = i; j < n - 1; j++){
                    arr[j] = arr[j + 1];
                }
                n--; 
                i--; 
            }
        }

        System.out.println("Array after deleting the element: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
