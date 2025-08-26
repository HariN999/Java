package Day2;
import java.util.*;
public class Multiplication {
    static public void multi(int n){
        for(int i =1; i<=10; i++)
            System.out.println(n+" * "+i+" = "+n*i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        multi(n);
        sc.close();
    }
    }
              