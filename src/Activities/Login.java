package Activities;

import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        String userName = "flitpix";
        String password = "Pa$$w0rd";
        String name = JOptionPane.showInputDialog("Please enter your username:");
        String pass = JOptionPane.showInputDialog("Please enter your password:");

        if (name.equals(userName) && pass.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if (!name.equals(userName) && pass.equals(password)) {
            JOptionPane.showMessageDialog(null,"Incorrect username.");
        } else if (!pass.equals(password) && name.equals(userName)) {
            JOptionPane.showMessageDialog(null,"Incorrect password.");
        } else {
            JOptionPane.showMessageDialog(null,"Your login information is incorrect. Please try again.");
        }
    }
}
