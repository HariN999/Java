package DAY6;
import java.util.*;
public class SecondMaxFrom2ndHalf {
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
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = n/2; i < n; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second maximum element in the first half of the array.");
        } else {
            System.out.println("The second maximum element in the first half of the array is: " + secondMax);
        }
    }
}
