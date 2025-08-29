package Day10;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = toLowerAndRemoveSpaces(str1);
        str2 = toLowerAndRemoveSpaces(str2);

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static String toLowerAndRemoveSpaces(String s) {
        char[] arr = s.toCharArray();
        char[] result = new char[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + ('a' - 'A'));
            }
            if (c != ' ' && c != '\t' && c != '\n') {
                result[idx++] = c;
            }
        }
        return new String(result, 0, idx);
    }
}

