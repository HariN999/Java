package Day2;
import java.util.*;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0 ;
        for(int i=1; i<=num; i++){
            sum+=i;
        } 
        System.out.println("Sum of "+num+" numbers is "+sum);
        sc.close();
    }
    
}
