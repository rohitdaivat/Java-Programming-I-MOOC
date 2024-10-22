
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int i = 0;
            if (i < pieces.length) {
                if (oldest < Integer.valueOf(pieces[1])) {
                    oldest = Integer.valueOf(pieces[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
        
    }
}
