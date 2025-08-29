package Day10;

import java.util.*;
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.nextLine();
        String res = "";
        String word = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch != ' ') {
                word = ch + word;
            } else {
                res = res + word + " "; 
                word = "";
            }
        }
        res = res + word; 

        System.out.println("Original String : " + a);
        System.out.println("Reversed String : " + res.trim());
        sc.close();
    }
}