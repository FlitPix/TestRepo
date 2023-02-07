package Activities;
import java.util.Scanner;
public class AverageRainfall {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int years, inches, months, totalInches = 0; // Initialize variables

        // Ask user for inputs
        System.out.print("Enter number of years: ");
        years = Integer.parseInt(keyboard.next());

        // Calculate total months
        months = years * 12;

        // First loop for years
        for (int i = 1; i <= years; i++) {
            // Second loop for months
            for (int j = 1; j <= 12; j++) {
                System.out.print("Enter inches for year " + i + ", month " + j + ": ");
                inches = Integer.parseInt(keyboard.next());
                totalInches += inches;
            }
        }

        // Display results
        System.out.printf("Number of months: %d", months);
        System.out.printf("\nTotal inches of rainfall: %d", totalInches);
        double avgInches = (double)totalInches / months; // Calculate average
        System.out.println("\nAverage rainfall per month for " + years + " years: " + avgInches);
    }
}
