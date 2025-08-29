package Day10;

import java.util.Scanner;

public class ConvertLowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Upper case: ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                ch -= 32;
            }
            char res = (char) ch;

            System.out.print(res);
        }
        sc.close();
        System.out.println();
        System.out.print("Lower case: ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            char res = (char) ch;

            System.out.print(res);
        }
    }
}
