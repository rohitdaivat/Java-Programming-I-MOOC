
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
        printFile();

    }

    public static void printFile() {
        try ( Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }
}
