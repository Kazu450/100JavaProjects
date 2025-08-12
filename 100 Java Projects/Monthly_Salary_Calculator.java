import java.util.Scanner;
public class Monthly_Salary_Calculator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        boolean calculator = true;

        while (calculator) { System.out.println("=== Monthly Salary Calculator ===\n");
        System.out.println("Enter employee details: ");
        System.out.print("Employee Name: ");
        String name = w.nextLine();
        System.out.print("Hourly Rate: ");
        if(!w.hasNextDouble()){System.out.println("Invalid input.\n"); w.nextLine(); continue;}
        double hour = w.nextDouble(); w.nextLine();
        System.out.print("Hours Worked This Month: ");
        if(!w.hasNextDouble()){System.out.println("Invalid input\n"); w.nextLine(); continue;}
        double month = w.nextDouble();w.nextLine();

        System.out.println("\nCalculating salary for " + name + "....");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {System.out.println("Interupted.");
        }
        System.out.println("Total Salary PHP" + hour * month);
        }
    }
}
