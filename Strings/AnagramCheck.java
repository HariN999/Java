package Day10;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "ad";
        String str2 = "bc";

        str1 = str1.replaceAll(" ","");
        str2 = str2.replaceAll(" ","");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        int str1Sum = 0;
        int str2Sum = 0;

        int prod1 =1;
        int prod2= 1;

        for(int i = 0; i<str1.length(); i++){
            str1Sum = str1Sum + str1.charAt(i);
            str2Sum = str2Sum + str2.charAt(i);

            prod1 = prod1*str1.charAt(i);
            prod2 = prod2*str2.charAt(i);
        }

        if (str1Sum == str2Sum && prod1 == prod2) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
