package Activities;
import java.util.Scanner;

public class SwitchActivity {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a Pokedex number from 1 to 9, or nothing to exit: ");
        int dex = Integer.parseInt(keyboard.next());

        switch (dex) {
            case 1:
                System.out.println("Bulbasaur");
                break;
            case 2:
                System.out.println("Ivysaur");
                break;
            case 3:
                System.out.println("Venusaur");
                break;
            case 4:
                System.out.println("Charmander");
                break;
            case 5:
                System.out.println("Charmeleon");
                break;
            case 6:
                System.out.println("Charizard");
                break;
            case 7:
                System.out.println("Squirtle");
                break;
            case 8:
                System.out.println("Wartortle");
                break;
            case 9:
                System.out.println("Blastoise");
                break;
            default:
                System.out.println("MissingNo.");
                break;
        }
    }
}
