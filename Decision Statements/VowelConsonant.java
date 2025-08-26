package Day1;

import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char d = sc.next().charAt(0);

        if (!((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'))) {
            System.out.println("Invalid input. Please enter an alphabet character only.");
            sc.close();
            return;
        }

        if (d >= 'A' && d <= 'Z') {
            d = (char) (d + 32); 
        }

        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ) {
            System.out.println(d + " is a vowel.");
        } else {
            System.out.println(d + " is a consonant.");
        }
        sc.close();
    }
}
