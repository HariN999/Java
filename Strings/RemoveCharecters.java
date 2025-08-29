package Day9;
public class RemoveCharecters {
    public static void main(String[] args) {
        String str = "He@llo! Wo#rld$ 123%^&*()";
        String result = ""; 

        for (char c : str.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ') {
                result += c; 
            }
        }

        System.out.println(result);
    }
}