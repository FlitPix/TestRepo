package Activities.A2;

import java.util.Scanner;

public class TestScores {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int score1, score2, score3; //variables

        System.out.println("What score did you get on your first test?");
        score1 = Integer.parseInt(keyboard.nextLine()); //permit text entry, parse input as int
        System.out.println("What score did you get on your second test?");
        score2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("What score did you get on your third test?");
        score3 = Integer.parseInt(keyboard.nextLine());

        int avg = (score1+score2+score3)/3;
        System.out.printf("Your average score is %d.", avg);
        System.out.print("\nYour grade is: "); //print average
        //conditional to print letter grade
        if (avg < 60) {
            System.out.print("F");
        } else if (avg >= 60 && avg <= 69) {
            System.out.print("D");
        } else if (avg >= 70 && avg <= 79) {
            System.out.print("C");
        } else if (avg >= 80 && avg <= 89) {
            System.out.print("B");
        } else {
            System.out.print("A");
        }
    }
}
