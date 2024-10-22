
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
        
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        
        while (beginning <= end) {
            int divi = beginning % 3;
            if (divi == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }
        
    }

}
