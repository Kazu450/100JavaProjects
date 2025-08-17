import java.util.Scanner;
public class Interest_Calculator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("=== Interest Calculator ===");
        System.out.print("Enter Principal Amount: ");
        double amount = w.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        double interest = w.nextDouble();
        System.out.print("Enter Time (in years): ");
        double years = w.nextDouble();

        double simple = (amount * interest * years) /100;
        double total = amount + simple;
        
        System.out.println("Simple Interest = " + simple);
        System.out.println("Total Amount (Principal + Interest) = " + total);

        w.close();
    }
}
