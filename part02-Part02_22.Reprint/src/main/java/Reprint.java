
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask the user for how many times should the text be printed
        System.out.println("How many times?");
        int input = Integer.valueOf(scanner.nextLine());
        // then call the printText-method multiple times with a while-loop

        for (int i = 1; i <= input; i++) {
            printText();
        }

    }

  
    public static void printText() {

        System.out.println("In a hole in the ground there lived a method");
    }
}
