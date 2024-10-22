
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int row = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner filename = new Scanner(Paths.get(file))) {

            while (filename.hasNextLine()) {
                row = Integer.valueOf(filename.nextLine());
                if (lowerBound <= row && row <= upperBound) {
                    count++;
                } else {
                continue;
                }
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        System.out.println("Numbers: " + count);

    }

}
