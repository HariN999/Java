package Day3;

import java.util.*;
public class LCMOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = findgcd(num1,num2);
        int lcm = (num1*num2)/gcd;
        System.out.println("LCM is "+ lcm);
        System.out.println("GCD is "+ gcd);
        sc.close();
    }
        public static int findgcd(int a, int b){
            while(b!=0){
                int temp = b;
                b= a%b;
                a=temp;
            }
            return a;
        }


    }

