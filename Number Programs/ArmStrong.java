package Day3;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		int original = n;
		int sum = 0;
		int digits = 0;
		int temp = n;
		// Count digits
		while (temp != 0) {
			digits++;
			temp /= 10;
		}
		temp = n;
		// Calculate sum of powers
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp /= 10;
		}
		if (sum == original) {
			System.out.println(original + " is an Armstrong number.");
		} else {
			System.out.println(original + " is not an Armstrong number.");
		}
		sc.close();
	}
}

