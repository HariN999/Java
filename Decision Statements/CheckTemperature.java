package Day1.Assignment;
import java.util.*;
public class CheckTemperature {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temperature = sc.nextDouble();
        if (temperature < -273.15) {
            System.out.println("Invalid input. Temperature cannot be below absolute zero (-273.15°C).");
        } 
        else if (temperature < 0) {
            System.out.println("Temperature is Cold");
        } 
        else if (temperature >= 0 && temperature <= 50) {
            System.out.println("Temperature is very warm");
        } 
        else {   
            System.out.println("Temperature is very hot");
        }
        sc.close();
    }
}
