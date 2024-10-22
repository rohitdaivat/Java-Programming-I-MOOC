

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
        
    }
    
    public static void printUntilNumber(int input){
        int counter = 1;
        
        while (counter <= input) {
            System.out.println(counter);
            counter++;
        }
    }
}
