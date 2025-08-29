package Day10;

import java.util.*;
public class ReversingTheWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String res = "";
        String[] strArr = str.split(" ");
        for(int i = 0; i < strArr.length; i++){
            res += reverse(strArr[i]) + " ";
        }
        System.out.println(res);
        sc.close();
    }
    public static String reverse(String s){
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}