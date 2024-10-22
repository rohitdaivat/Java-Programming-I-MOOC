
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                
                String part[] = line.split(",");
                String name = part[0];
                int age = Integer.valueOf(part[1]);
                if (age == 1){
                System.out.println(name + ", age: " + age + " year");
                } else{
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);;
        }
        
    }
}
