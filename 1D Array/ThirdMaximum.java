package DAY6;
import java.util.*;
public class ThirdMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
             
                }
        int maxfirst = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > maxfirst){
                maxfirst = arr[i];
            }
        }
            Arrays.sort(arr);
            if(n < 3){
                System.out.println("Not enough elements");
            }
            else{
                System.out.println("Third maximum: "+arr[n-3]);
            }
            sc.close();
        }
    }