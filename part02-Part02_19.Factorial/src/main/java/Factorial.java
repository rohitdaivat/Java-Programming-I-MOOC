
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("GIve a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        int multi = 1;
        int i = 1;
        while (i <= num) {
        multi = multi * i;
        i++;
        }
            
        System.out.println(multi);
    }
}
