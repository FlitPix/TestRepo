package Activities.A10;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("userInfo.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String name = JOptionPane.showInputDialog("Enter your name");
            String gender = JOptionPane.showInputDialog("Enter your gender");
            String hobby = JOptionPane.showInputDialog("Enter your hobby");

            output.printf("%s %s %s", name, gender, hobby);
            fileWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
