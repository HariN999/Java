package Day6;
import java.util.*;
public class CountOfEvenOddElementsInArray {
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
        int evenCount = 0;
        int oddCount = 0;
        for(int num : arr){
            if(num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of even elements: " + evenCount);
        System.out.println("Count of odd elements: " + oddCount);
    }
}
