// Writes to a file. Contents in that file are lost if it already exists.
package Activities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("userInfo.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String name, gender, hobby;

        output.printf("%s %s %s\n", "name", "age", "hobby"); // write header

        // ask user for information
        for (int i = 1; i <= 3; i++) {
            name = JOptionPane.showInputDialog(String.format("Enter your name %d", i));
            gender = JOptionPane.showInputDialog("Enter your gender");
            hobby = JOptionPane.showInputDialog("Enter your hobby");
            output.printf("%s %s %s\n", name, gender, hobby);
        }
        output.close();
    }
}
