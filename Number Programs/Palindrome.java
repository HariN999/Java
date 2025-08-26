package Day3;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int original = n;
        int ReverseNumber = 0;
        while(n>0){
            int lastdigit = n % 10;
            ReverseNumber = ReverseNumber*10+ lastdigit;
             n = n/10;
        }
        System.out.println("Reverse Number is "+ReverseNumber);
       if(original==ReverseNumber){
        System.out.println("It is palindrome");
       }
       else{   
            System.out.println("It is not palindrome");
       }
        sc.close();

        
                                                                                                 
}
}
