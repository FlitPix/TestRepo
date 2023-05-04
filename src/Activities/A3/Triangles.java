package Activities.A3;

import java.util.Scanner;

public class Triangles {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int side1, side2, side3;
        System.out.print("Enter the length of side one: ");
        side1 = Integer.parseInt(keyboard.next());
        System.out.print("Enter the length of side two: ");
        side2 = Integer.parseInt(keyboard.next());
        System.out.print("Enter the length of side three: ");
        side3 = Integer.parseInt(keyboard.next());
        
        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle!");
        } else if ((side1 == side2 && side2 != side3) || (side1 == side3 && side2 != side3)) { // dirty method of checking for isosceles
            System.out.println("This is an isosceles triangle!");
        } else {
            System.out.println("This is a scalene triangle!");
        }
    }
}
