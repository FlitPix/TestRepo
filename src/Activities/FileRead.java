// Outputs contents of a file, if it's in a specific structure.
package Activities;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("userInfo.txt");
        try {
            Scanner input = new Scanner(file); // read the file
            String header = input.nextLine(); // print file header
            System.out.println(header);
            while (input.hasNextLine()) { // is there another line to read in the file?
                String course = input.next();
                String credits = input.next();
                String score = input.next();
                System.out.printf("%-7s %3s %7s\n", course, credits, score);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}
