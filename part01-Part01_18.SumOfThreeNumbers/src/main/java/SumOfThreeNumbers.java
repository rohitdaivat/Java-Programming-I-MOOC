
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give the first number:");
       int firstInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int thirdInput = Integer.valueOf(scanner.nextLine());
        
        int answer = firstInput + secondInput + thirdInput;
        System.out.println("The sum of the numbers is " + answer);
    }
}
