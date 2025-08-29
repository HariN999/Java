package Day9;

public class CountCase {
           public static void main(String[] args){
                String str = "Hello";
                int countupper = 0;
                int countlower = 0;
                for(int i = 0; i < str.length(); i++){
                    char ch = str.charAt(i);
                    if(ch >= 'A' && ch <='2'){
                        countupper++;
                    }else if(ch >= 'a' && ch <= '2'){
                        countlower++;
                    }
                }
                System.out.println("Uppercase count: "+countupper);
                System.out.println("Lowercase count: "+countlower);
           }                                                                            
        }

