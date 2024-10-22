
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        printFile(file);
    }

    public static void printFile(String fileName) {
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            
        }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
