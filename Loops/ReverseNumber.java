package Day2;
import java.util.*;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int ReverseNumber = 0;
        while(n!=0){
            int lastdigit = n % 10;
            ReverseNumber = ReverseNumber*10+ lastdigit;
             n = n/10;
        }
        System.out.println("The reversed number is "+ReverseNumber);
        sc.close();
    }
}