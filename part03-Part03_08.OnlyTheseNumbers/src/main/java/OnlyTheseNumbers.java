
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where? ");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("From where? ");
        int input2 = Integer.valueOf(scanner.nextLine());
        
        while (input1 <= input2) {
            System.out.println(numbers.get(input1));
            input1++;
        }

    }
}
