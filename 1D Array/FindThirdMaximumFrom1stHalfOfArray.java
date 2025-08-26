package Day6.Assignment;
import java.util.*;
public class FindThirdMaximumFrom1stHalfOfArray {
    Scanner sc = new Scanner(System.in);
    public void inputArray(int arr[], int n){
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void findThirdMax(int arr[], int n){
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for(int i = 0; i < n / 2; i++){
            if(arr[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i] > secondMax && arr[i] != firstMax){
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if(arr[i] > thirdMax && arr[i] != secondMax && arr[i] != firstMax){
                thirdMax = arr[i];
            }
        }
        if(thirdMax == Integer.MIN_VALUE){
            System.out.println("There is no third maximum element in the first half of the array.");
        } else {
            System.out.println("The third maximum element in the first half of the array is: " + thirdMax);
        }
    }
}
