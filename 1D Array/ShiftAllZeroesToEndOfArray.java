package Day6.Assignment;
import java.util.*;
public class ShiftAllZeroesToEndOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0; 
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i]; 
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
        System.out.print("The array after shifting zeroes to the end is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}