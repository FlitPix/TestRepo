package Activities.A5;
import java.util.Scanner;

public class RestaurantSelector {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // query user
        System.out.print("Is anyone in your party a vegetarian? ");
        String veget = keyboard.next(); // vegetarian
        System.out.print("Is anyone in your party a vegan? ");
        String vegan = keyboard.next();
        System.out.print("Is anyone in your party gluten-free? ");
        String gluten = keyboard.next(); // gluten-free

        // filter options
        int burgers = 1, pizza = 1, italian = 1; // Corner Café and Chef's Kitchen are excluded as they are output with all combinations
        if (veget.equalsIgnoreCase("yes")) {
            burgers = 0;
        }
        if (vegan.equalsIgnoreCase("yes")) {
            burgers = 0;
            pizza = 0;
            italian = 0;
        }
        if (gluten.equalsIgnoreCase("yes")) {
            burgers = 0;
            italian = 0;
        }

        // display results
        System.out.println("Here are your restaurant options:");
        if (burgers == 1) {
            System.out.println("    Joe's Gourmet Burgers");
        }
        if (pizza == 1) {
            System.out.println("    Main Street Pizza Company");
        }
        System.out.println("    Corner Café"); // Always output
        if (italian == 1) {
            System.out.println("    Mama's Fine Italian");
        }
        System.out.println("    The Chef's Kitchen"); // Always output
    }
}
