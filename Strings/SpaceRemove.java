package Day9;
public class SpaceRemove {
    public static void main(String[] args) {
        String str = "   Hello   World   ";
        String result = "";

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                result += c;  
            }
        }

        System.out.println(result);
    }
}
