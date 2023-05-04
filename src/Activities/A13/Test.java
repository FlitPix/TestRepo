package Activities.A13;

public class Test {
    public static void main(String[] args){
        // Init object
        Pokemon bulbasaur = new Pokemon("Bulbasaur","Grass/Poison",5,500,20);

        // Test which variables can be accessed
        Pokemon.name = "Charmander";
        Pokemon.type = "Fire";
        //Pokemon.level = 6;
        //Pokemon.exp = 500;
        //Pokemon.hp = 30;

        // Test which methods can be accessed
        Pokemon.printName();
        Pokemon.printType();
        //Pokemon.printHP();
        Pokemon.printEXP();
    }
}
