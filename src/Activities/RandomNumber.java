package Activities;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // Initialize variables
        int randNum, correct = 0;
        String color, guess;
        Random random = new Random(); // Random instance

        // Loop for guessing
        for (int i = 1; i <= 10; i++) {
            // Generate random number, and assign a color
            randNum = random.nextInt(5); // Rolls between 0 (inc.) and 5 (exc.)
            if (randNum == 0) {
                color = "red";
            } else if (randNum == 1) {
                color = "green";
            } else if (randNum == 2) {
                color = "blue";
            } else if (randNum == 3) {
                color = "orange";
            } else {
                color = "yellow";
            }

            // Guess
            System.out.print(i + ": What color has the computer chosen? ");
            guess = keyboard.next();
            System.out.printf("   The computer chose %s.\n", color);

            // Check answer - if true, increase correct count
            if (guess.equalsIgnoreCase(color)) {correct++;}
        }

        // Display results
        System.out.printf("You got %d out of 10 correct!", correct);
    }
}
