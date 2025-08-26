package Day1;
import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0)
            System.out.println(year+ " is leapyear");
        else
            System.out.println(year+" is not leapyear");
        
        sc.close();
    }
    
}
