
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2, 8};
        printArrayInStars(array);
    }
    
    public static void printArrayInStars (int[] array) {
        for (int star : array) {
            printStar(star);
            System.out.println();
        }
    }
    
    public static void printStar(int howMany){
        while (howMany > 0) {
            System.out.print("*");
            howMany = howMany - 1;
        }
    }

}
