package Day6;
import java.util.*;
public class AverageOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        double average = (double)sum/n;
        System.out.println("The average of the elements in the array is: " + average);
    }
}
