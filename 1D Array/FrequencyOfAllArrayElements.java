package Day7;

import java.util.*;
public class FrequencyOfAllArrayElements {
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

            boolean[] visited = new boolean[n];
            System.out.println("Frequency of all elements:");
            for(int i = 0; i < n; i++) {
                if(visited[i]) continue;
                int count = 1;
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " time(s)");
}
    }
}