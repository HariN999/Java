package DAY6;
import java.util.*;
public class SumOfNumbersInArray {
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
        for(int num = 0; num < n; num++){
            sum += arr[num];
        }
        System.out.println("The sum of elements in the array is: " + sum);
    }
}
