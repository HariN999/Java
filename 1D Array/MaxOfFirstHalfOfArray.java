package DAY6;
import java.util.*;
public class MaxOfFirstHalfOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = arr[0];
        for(int i = 0; i < n/2; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the first half of the array is: " + max);
    }
}
