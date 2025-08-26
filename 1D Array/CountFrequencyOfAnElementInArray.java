package Day6;
import java.util.*;
public class CountFrequencyOfAnElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find its frequency: ");
        int x = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("The frequency of " + x + " in the array is: " + count);
    }
}
