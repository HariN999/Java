package DAY6;
import java.util.*;
public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        sc.close();

        int index = -1; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + target + " is present at index " + index + ".");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}