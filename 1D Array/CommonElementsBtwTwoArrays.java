package Day7;

import java.util.Scanner;

public class CommonElementsBtwTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Common elements between the two arrays are: ");
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
