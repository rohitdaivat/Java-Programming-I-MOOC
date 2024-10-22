
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 1;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                i = list.size() - 1;
                break;
            }
            
            list.add(input);
        }
        System.out.println(list.get(list.size()-1));

    }
}
