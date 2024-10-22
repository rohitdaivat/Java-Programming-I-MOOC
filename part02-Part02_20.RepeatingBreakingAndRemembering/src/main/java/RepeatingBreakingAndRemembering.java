import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // Scanner initialization
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0, numbers = 0, odd = 0, even = 0, input;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());

            // Check for the termination condition
            if (input == -1) {
                break;  // Exit the loop when -1 is input
            }

            // Add the input to the sum and count the numbers
            sum += input;
            numbers++;

            // Check if the number is even or odd
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Calculate the average
        double avg = (numbers > 0) ? (double) sum / numbers : 0;

        // Print results
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}