package Activities.A8;
import java.util.Scanner;
public class TestAverage {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // Initialize variables
        int students, tests, score;

        // Ask user for inputs
        System.out.print("How many students are there? ");
        students = Integer.parseInt(keyboard.next());
        System.out.print("How many tests did each student take? ");
        tests = Integer.parseInt(keyboard.next());

        // First loop for students
        for (int i = 1; i <= students; i++) {
            int totalScore = 0;
            System.out.printf("Student %d:\n", i);
            System.out.println("-".repeat(14)); // Repeat hyphen string 14 times
            // Second loop for tests
            for (int j = 1; j <= tests; j++) {
                System.out.printf("Enter score %d: ", j);
                score = Integer.parseInt(keyboard.next());
                totalScore += score; // increment total score
            }
            // Calculate and print average
            int avgScore = totalScore / tests;
            System.out.print("The average for student " + i + " is " + avgScore + ".\n");
        }
    }
}
