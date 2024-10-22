
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldest = "hello";
        int i = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }

            String[] pieces = input.split(",");
            if (i < Integer.valueOf(pieces[1])) {
                i = Integer.valueOf(pieces[1]);
                oldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
