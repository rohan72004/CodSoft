package Rohan;
import java.util.*;
public class Marks_Grade_Calculator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained (out of 100) in 5 subjects:");
        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();
        double sub4 = sc.nextDouble();
        double sub5 = sc.nextDouble();
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5;
        String grade;
        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
        System.out.println("===== RESULT =====");
        System.out.println("Total Marks       : " + total + " / 500");
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade             : " + grade);
        sc.close();
    }
}
