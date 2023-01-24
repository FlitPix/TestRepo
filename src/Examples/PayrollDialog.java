package Examples;
// Demonstration of dialog boxes using JOptionPane
import javax.swing.JOptionPane;
public class PayrollDialog {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;

        name = JOptionPane.showInputDialog("What is your name?");
        hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours did you work this week?")); //parses input as int instead of string
        payRate = Double.parseDouble(JOptionPane.showInputDialog("What is your hourly pay rate?")); //parses into double instead of int to allow decimals
        grossPay = hours * payRate;
        JOptionPane.showMessageDialog(null, String.format("Hello %s." + "\nYour gross pay is %.2f", name, grossPay));

        System.exit(0);
    }
}
