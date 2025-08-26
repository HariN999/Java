package DAY6;
import java.util.*;
public class SumOfOddElementsInArray {
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
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println("The sum of odd elements in the array is: " + sum);
    }
}
