package Projects;

import java.util.Scanner;

public class PokemonBattle {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // Variables
        int rounds;

        // Player 1 variables
        String nameP1, moveP1; // Pokemon and move names
        int hpP1, bpP1, speP1, winP1=0; // HP, move base power, speed, and wins

        // Player 2 variables
        String nameP2, moveP2;
        int hpP2, bpP2, speP2, winP2=0;

        System.out.println("POKEMON BATTLE!!\nEnter how many rounds you'd like to play (must be odd): ");
        rounds = keyboard.nextInt(); // Accept rounds input
        // Input validation
        while (rounds % 2 == 0 || rounds < 0) {
            System.out.println("Invalid input, try again: ");
            rounds = keyboard.nextInt();
        }

        int currentRound = 1;
        while (currentRound <= rounds) { // Check that the game has not ended yet
            System.out.println("Player 1! Choose your Pokemon!\nEnter your Pokemon's name: ");
            nameP1 = keyboard.next(); // Accept name input
            System.out.print("Enter your Pokemon's move: ");
            moveP1 = keyboard.next(); // Accept move input
            System.out.print("Enter your Pokemon's HP: ");
            hpP1 = keyboard.nextInt(); // Accept HP input
            System.out.print("Enter your Pokemon's move's power: ");
            bpP1 = keyboard.nextInt(); // Accept power input
            System.out.print("Enter your Pokemon's Speed: ");
            speP1 = keyboard.nextInt(); // Accept speed input

            System.out.println("\nPlayer 2! Choose your Pokemon!\nEnter your Pokemon's name: ");
            nameP2 = keyboard.next(); // Accept name input
            System.out.print("Enter your Pokemon's move: ");
            moveP2 = keyboard.next(); // Accept move input
            System.out.print("Enter your Pokemon's HP: ");
            hpP2 = keyboard.nextInt(); // Accept HP input
            System.out.print("Enter your Pokemon's move's power: ");
            bpP2 = keyboard.nextInt(); // Accept power input
            System.out.print("Enter your Pokemon's Speed: ");
            speP2 = keyboard.nextInt(); // Accept speed input

            // Battle!
            while (hpP1 > 0 && hpP2 > 0) {
                // Speed check
                if (speP1 > speP2) {
                    // TODO: P1 attacks first
                } else {
                    // TODO: P2 attacks first
                }
            }

            // Whose HP is 0?
            if (hpP1 <= 0) {
                System.out.println("Player 2 wins!");
                winP2++; // TODO: Figure out why wins are not initializing
            } else if (hpP2 <= 0) {
                System.out.println("Player 1 wins!");
                winP1++;
            }

            currentRound++; // Increment current round
        }
    }
}
