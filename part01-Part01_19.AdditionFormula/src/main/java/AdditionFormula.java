
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        int answer = x + y; 
        System.out.println(x + " + " + y + " = " + answer);

    }
}
