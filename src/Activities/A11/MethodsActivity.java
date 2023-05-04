// Demonstrates the use of functions/methods with a simple rectangle area calculator.
package Activities.A11;
import java.util.Scanner;
public class MethodsActivity {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        keyboard.close();
    }
    public static double getLength() {
        System.out.print("Enter the length of a rectangle: ");
        double length = Double.parseDouble(keyboard.next());
        return length;
    }
    public static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        double width = Double.parseDouble(keyboard.next());
        return width;
    }
    public static double getArea(double length, double width) {
        return length * width;
    }
    public static void displayData(double length, double width, double area) {

        System.out.printf("Rectangle length: %.1f\n", length);
        System.out.printf("Rectangle width: %.1f\n", width);
        System.out.printf("Rectangle area: %.1f", area);
    }
}
