package Projects;

import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // Overall variables
        int rounds, turn = 1;
        Random random = new Random();

        // Player 1 variables
        String nameP1, moveP1; // Pokémon and move names
        int hpP1, bpP1, speP1, winP1 = 0; // HP, move base power, speed, and wins

        // Player 2 variables
        String nameP2, moveP2;
        int hpP2, bpP2, speP2, winP2 = 0;

        System.out.print("POKEMON BATTLE!!\nEnter how many rounds you'd like to play (must be odd): ");
        rounds = keyboard.nextInt(); // Accept rounds input
        // Input validation
        while (rounds % 2 == 0 || rounds < 1) {
            System.out.print("Invalid input, try again: ");
            rounds = keyboard.nextInt();
        }

        int currentRound = 1;
        while (currentRound <= rounds) { // Check that the game has not ended yet
            System.out.println("\nROUND " + currentRound);
            System.out.println("=".repeat(7));
            System.out.print("Player 1! Choose your Pokemon!\nEnter your Pokemon's name: ");
            nameP1 = keyboard.next(); // Accept name input
            System.out.print("Enter your Pokemon's move: ");
            moveP1 = keyboard.next(); // Accept move input
            System.out.print("Enter your Pokemon's HP: ");
            hpP1 = keyboard.nextInt(); // Accept HP input
            System.out.print("Enter your Pokemon's move's power: ");
            bpP1 = keyboard.nextInt(); // Accept power input
            System.out.print("Enter your Pokemon's Speed: ");
            speP1 = keyboard.nextInt(); // Accept speed input

            System.out.print("\nPlayer 2! Choose your Pokemon!\nEnter your Pokemon's name: ");
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
                System.out.println("\nTURN " + turn);
                // Speed check
                if (speP1 > speP2) { // Player 1 is faster
                    System.out.println("Player 1's " + nameP1 + " used " + moveP1 + ", dealing " + bpP1 + " damage!");
                    hpP2 -= bpP1; // Damage
                    System.out.println("Player 2's " + nameP2 + " has " + hpP2 + " HP left.");
                    if (hpP2 > 0) { // If Player 2 hasn't fainted, they can act
                        System.out.println("Player 2's " + nameP2 + " used " + moveP2 + ", dealing " + bpP2 + " damage!");
                        hpP1 -= bpP2;
                        System.out.println("Player 1's " + nameP1 + " has " + hpP1 + " HP left.");
                    }
                } else if (speP1 < speP2) { // Player 2 is faster
                    System.out.println("Player 2's " + nameP2 + " used " + moveP2 + ", dealing " + bpP2 + " damage!");
                    hpP1 -= bpP2; // Damage
                    System.out.println("Player 1's " + nameP1 + " has " + hpP1 + " HP left.");
                    if (hpP1 > 0) { // If Player 1 hasn't fainted, they can act
                        System.out.println("Player 1's " + nameP1 + " used " + moveP1 + ", dealing " + bpP1 + " damage!");
                        hpP2 -= bpP1;
                        System.out.println("Player 2's " + nameP2 + " has " + hpP2 + " HP left.");
                    }
                } else { // Speed tie
                    System.out.println("Speed tie! Rolling...");
                    int speTie = random.nextInt(2);
                    if (speTie == 0) { // Player 1 wins roll
                        System.out.println("Player 1 won the roll!");
                        System.out.println("Player 1's " + nameP1 + " used " + moveP1 + ", dealing " + bpP1 + " damage!");
                        hpP2 -= bpP1; // Damage
                        System.out.println("Player 2's " + nameP2 + " has " + hpP2 + " HP left.");
                        if (hpP2 > 0) { // If Player 2 hasn't fainted, they can act
                            System.out.println("Player 2's " + nameP2 + " used " + moveP2 + ", dealing " + bpP2 + " damage!");
                            hpP1 -= bpP2;
                            System.out.println("Player 1's " + nameP1 + " has " + hpP1 + " HP left.");
                        }
                    } else { // Player 2 wins roll
                        System.out.println("Player 2 won the roll!");
                        System.out.println("Player 2's " + nameP2 + " used " + moveP2 + ", dealing " + bpP2 + " damage!");
                        hpP1 -= bpP2; // Damage
                        System.out.println("Player 1's " + nameP1 + " has " + hpP1 + " HP left.");
                        if (hpP1 > 0) { // If Player 1 hasn't fainted, they can act
                            System.out.println("Player 1's " + nameP1 + " used " + moveP1 + ", dealing " + bpP1 + " damage!");
                            hpP2 -= bpP1;
                            System.out.println("Player 2's " + nameP2 + " has " + hpP2 + " HP left.");
                        }
                    }
                }
                turn++;
            }

            // Who wins?
            if (hpP1 <= 0) {
                System.out.println("\nPlayer 2 wins!");
                winP2++;
                // List wins (debugging)
                System.out.println("They've won " + winP2 + " time(s).");
                System.out.println("Meanwhile, Player 1 has won " + winP1 + " time(s).");
            } else if (hpP2 <= 0) {
                System.out.println("\nPlayer 1 wins!");
                winP1++;
                // List wins (debugging)
                System.out.println("They've won " + winP1 + " times.");
                System.out.println("Meanwhile, Player 2 has won " + winP2 + " times.");
            }

            currentRound++; // Increment current round
        }
    }
}
