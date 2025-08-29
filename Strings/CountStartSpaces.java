package Day9;
public class CountStartSpaces {
    public static void main(String[] args) {
        String str = "   Hello   World   ";

        int startSpaces = 0;
        int endSpaces = 0;

        
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            startSpaces++;
            i++;
        }

        
        int j = str.length() - 1;
        while (j >= 0 && str.charAt(j) == ' ') {
            endSpaces++;
            j--;
        }

        System.out.println("Leading spaces: " + startSpaces);
        System.out.println("Trailing spaces: " + endSpaces);
    }
}
