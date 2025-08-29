package Day9;

public class EmptyString {
    public static void main(String[] args){
      //without built in
      String str = "";
      int length = 0;
      boolean isEmpty = true;

      for (char c : str.toCharArray()) {
          length++;
          if (c != ' ') {
              isEmpty = false;
          }
      }

      System.out.println("The length of the string is: " + length);
      System.out.println("The string is empty: " + isEmpty);
    }
}