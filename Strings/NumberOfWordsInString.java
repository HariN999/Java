package Day10;

import java.util.Scanner;

public class NumberOfWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        System.out.println("Number of words: " + words.length);
        sc.close();
    }
}