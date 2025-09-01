import java.util.Scanner;
public class Tip_Calculator {
    public static void main (String[] args){

        Scanner w = new Scanner(System.in);

        System.out.println("--- Tip Calculator ---");
        System.out.print("Enter the bill amount: ");
        double amount = w.nextDouble();
        System.out.print("Enter the tip percentage: ");
        double percent = w.nextDouble();
        System.out.print("Enter number of people: ");
        double number = w.nextDouble();

        System.out.println("Calculating...");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Interupted.");
        }

        double tip = amount * (percent / 100);
        double totalbill = amount + tip;
        double each = totalbill / number;

        System.out.println("Total Bill (with Tip): " + totalbill);
        System.out.println("Each Person Pays: " + each);
        
        w.close();

    }
}
