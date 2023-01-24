package Activities;

import java.util.Scanner;

public class A2BookClubPoints {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int books;

        System.out.println("How many books have you read?");
        books = Integer.parseInt(keyboard.nextLine()); //permit text entry

        if (books == 0) {
            System.out.println("You've earned 0 points. Earn more points by reading books!");
        } else if (books == 1) {
            System.out.println("You've earned 5 points. Good work!");
        } else if (books == 2) {
            System.out.println("You've earned 15 points. Great work!");
        } else if (books == 3) {
            System.out.println("You've earned 30 points. Fantastic work!");
        } else if (books >= 4) {
            System.out.println("You've earned 60 points. Outstanding work!");
        } else {
            System.out.println("Invalid input, please try again.");
        }
    }
}
