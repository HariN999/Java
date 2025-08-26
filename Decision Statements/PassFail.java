package Day1.Assignment;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total percentage obtained: ");
        double percentage = sc.nextDouble();
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid input. Please enter a percentage between 0 and 100.");
        } 
        else if (percentage >= 40) {
            System.out.println("Result: Pass");
        } 
        else {
            System.out.println("Result: Fail");
        }
        sc.close();
    }
}
