package Activities.A13;

public class Pokemon {
    // Variables
    public static String name;
    public static String type;
    private double level;
    private static double exp;
    private double hp;

    // Constructor
    public Pokemon(String name, String type, double level, double exp, double hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
    }

    // Methods
    // Prints name
    public static void printName() {
        System.out.println("Your Pokemon's name is " + name);
    }
    // Prints type
    protected static void printType() {
        System.out.println("Your Pokemon is a " + type + " type");
    }
    // Prints HP
    private void printHP() {
        System.out.println("Your Pokemon has " + String.format("%.0f",hp) + " HP");
    }

    static void printEXP() {
        System.out.println("Your Pokemon has " + String.format("%.0f",exp) + " HP");
    }
}
