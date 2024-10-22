
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());
        
        //gift calculation
        double a = (100 + (gift-5000)*0.08); 
        double b = (1700 + (gift-25000)*0.10); 
        double c = (4700 + (gift-55000)*0.12); 
        double d = (22100 + (gift-200000)*0.15); 
        double e = (142100 + (gift-1000000)*0.17); 
        
        //end
        
        if (gift < 5000) {
            System.out.println("No tax!");            
        } else if (gift >= 5000 && gift < 25000){
            System.out.println("Tax: " + a);
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + b);
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("Tax: " + c);
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + d);
        } else {
            System.out.println("Tax: " + e);
        }
        
    }
}
