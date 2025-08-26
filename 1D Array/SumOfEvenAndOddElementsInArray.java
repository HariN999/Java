package DAY6;
import java.util.*;
public class SumOfEvenAndOddElementsInArray {
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
        int evenSum = 0;
        int oddSum = 0;
        for(int num : arr){
            if(num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("The sum of even elements is: " + evenSum);
        System.out.println("The sum of odd elements is: " + oddSum);
    }
}