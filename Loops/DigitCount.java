package Day2;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int count =0;
        int zerocount =0;
        for(int i =n; i>0; i=i/10) {
            count++;
            if(i/10==0)
                zerocount++;
        }
        
        System.out.println("There are "+(count + zerocount) + " digits.");

        sc.close();       

    }
    
}
