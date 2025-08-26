package DAY7.ASSIGNMENT;
import java.util.*;
public class RemoveEvenNumbersFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array after removing even numbers: ");
        for(int i = 0; i < count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
