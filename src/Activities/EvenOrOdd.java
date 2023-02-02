package Activities;

import java.util.Scanner;

public class EvenOrOdd {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        System.out.print("Enter a number: ");
        num = Integer.parseInt(keyboard.next());

        if (num % 2 == 0) {
            System.out.println("The number you entered is even.");
        } else {
            System.out.println("The number you entered is odd.");
        }
    }
}
