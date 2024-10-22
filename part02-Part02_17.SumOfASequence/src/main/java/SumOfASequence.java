
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int result = Integer.valueOf(scanner.nextLine());

        int out = 0;
       
        for (int i = 0; i <= result; i++){
            out += i;
        }
        System.out.println("The sum is " + out);
    }
}
