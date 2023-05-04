package Activities.A7;
import java.util.Scanner;
public class GuessingGame {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop = true;
        int num = 45, guesses = 0;
        while (loop == true) {
            guesses++;
            System.out.print("Guess a number between 1 and 50, or enter \"Q\" if you give up: ");
            String guess = keyboard.next();
            if (guess.equalsIgnoreCase("q")) {
                System.out.printf("Quitter! The number was %d.", num);
                loop = false;
            } else if (Integer.parseInt(guess) < num) {
                System.out.println("Too low. Try again!");
            } else if (Integer.parseInt(guess) > num) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Correct!");
                System.out.printf("Number of guesses: %d", guesses);
                loop = false;
            }
        }
    }
}
