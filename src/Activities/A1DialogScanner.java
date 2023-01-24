package Activities;

import java.util.Scanner;
public class A1DialogScanner {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        //Task 1: Reverse Strings
        String firstName, lastName;

        System.out.println("Name Reversal");
        System.out.println("Enter your first name:");
        firstName = keyboard.nextLine(); //Permit text entry
        System.out.println("Enter your last name:");
        lastName = keyboard.nextLine();

        String name = firstName + " " + lastName; //Concat

        StringBuilder reversedName = new StringBuilder(name); //Create mutable StringBuilder
        System.out.println(reversedName);
        System.out.println(reversedName.reverse()); //.reverse() method

        //Task 2: Arithmetic
        int d1, d2;

        System.out.println("\nArithmetic");
        System.out.println("Enter number one:");
        d1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter number two:");
        d2 = Integer.parseInt(keyboard.nextLine());

        int add = d1 + d2;
        System.out.println("\nSum: " + add);
        int sub = d1 - d2;
        System.out.println("Difference: " + sub);
        int prod = d1 * d2;
        System.out.println("Product: " + prod);
        double div = (double)d1 / d2;
        System.out.println("Quotient: " + div);
        int mod = d1 % d2;
        System.out.println("Remainder: " + mod);
    }
}
