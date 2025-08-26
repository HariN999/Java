package Day6.Assignment;
import java.util.*;
public class SeperateEvenOddInTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] oddArr = new int[n];
        int[] evenArr = new int[n];
        int oddIndex = 0, evenIndex = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        int index = 0;
        for(int i = 0; i < oddIndex; i++) {
            arr[index++] = oddArr[i];
        }
        for(int i = 0; i < evenIndex; i++) {
            arr[index++] = evenArr[i];
        }
        System.out.print("The odd array is: ");
        for(int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();
        System.out.print("The even array is: ");
        for(int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();
    }
}