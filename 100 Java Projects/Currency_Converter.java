import java.util.Scanner;
public class Currency_Converter {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.print("Enter amount in USD: ");
        if(!w.hasNextDouble()){System.out.println("Invalid input. Please enter a number."); return;}
        double usd = w.nextDouble();

        System.out.println("Select target currency:");
        System.out.println("1. PHP (Philippine Peso)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. JPY (Japanese Yen)");
        System.out.println("4. GBP (British Pound)");
        System.out.print("Choose an option (1-4): ");
        

        if(!w.hasNextInt()){System.out.println("Invalid choice. Please enter a number between 1 and 4"); return;}
        int target = w.nextInt();

        double ph = 57.03;
        double euro = 0.86;
        double yen = 147.82;
        double british = 0.74;

        switch(target){
            case 1 : System.out.println(usd + " USD = " + usd * ph + " PHP"); break;
            case 2 : System.out.println(usd + " USD = " + usd * euro + " EUR"); break;
            case 3 : System.out.println(usd + " USD = " + usd * yen + " JPY"); break;
            case 4 : System.out.println(usd + " USD = " + usd * british + " GBP"); break;

            default: System.out.println("Invalid choice. Please enter a number between 1 and 4");
            
        }
        
    }
}
