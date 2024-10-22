
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give speed:");
        int speeds = Integer.valueOf(scanner.nextLine());
        if (speeds > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
