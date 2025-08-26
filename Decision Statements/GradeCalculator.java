package Day1;

import java.util.*;
public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        if (marks >= 90 && marks <= 100) {
           System.out.println("Grade is A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade is B");
        } else if (marks >= 70 && marks < 80  ) {
            System.out.println("Grade is C");
        } else if (marks >= 60) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
        sc.close();
    }
}