
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
            
        boolean isFound = false;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Name of the file:");
            String file = scanner.nextLine();
            
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            
            try(Scanner fileScan = new Scanner(Paths.get(file))) {
                while(fileScan.hasNextLine()){
                    String row = fileScan.nextLine();
                   if (row.equals(searchedFor)){
                       isFound = true;
                   }
                }
                   
                   if(isFound) {
                       System.out.println("Found!");
                   } else {
                       System.out.println("Not found.");
                   }
                
            } catch (IOException ex) {
                System.out.println("Reading the file " + file + " failed.");
            }
    }
}
