
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input a number, 0 to quit");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            System.out.println("You input " + input);
        }
        System.out.println("Done, thank you!");
    }
}
