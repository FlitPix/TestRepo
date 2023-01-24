package Examples;

// Demonstration of integer vs double division
public class TypeCasting {
    public static void main(String[] args) {
        int int1 = 18;
        int int2 = 5;

        int int3 = int1 / int2;
        System.out.printf("1. Dividing int by int: %d\n", int3); //3

        double d0 = int1 / int2;
        System.out.printf("2. Assigning int quotient to double: %.2f\n", d0); //3.00

        double d4 = (double)(int1 / int2); //casting quotient to double
        System.out.printf("3. Casting quotient of int division: %.2f\n", d4); //3.00

        double d1 = (double)int1 / int2; //casting numerator to double
        System.out.printf("4. Dividing double by int: %.2f\n", d1); //3.60

        double d2 = int1 / (double)int2; //casting denominator to double
        System.out.printf("5. Dividing int by double: %.2f\n", d2); //3.60

        double d3 = (double)int1 / (double)int2; //casting both to double
        System.out.printf("6. Dividing double by double: %.2f\n", d3); //3.60
    }
}
