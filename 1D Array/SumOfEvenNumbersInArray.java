package DAY6;
import java.util.*;
public class SumOfEvenNumbersInArray {
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
        for(int num : arr){
            if(num % 2 == 0){
                sum += num;
            }
        }
        System.out.println("The sum of even numbers in the array is: " + sum);
    }
}
