
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

// we create a scanner for reading the file
        try ( Scanner scanner = new Scanner(Paths.get("file.txt"))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

// we print the total number of lines
        System.out.println("Total lines: " + lines.size());

    }
}
