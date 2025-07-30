import java.util.Scanner;
public class Simple_ATM_Simulation {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        double balance = 1000;
        
        System.out.println("==========================");
        System.out.println("     WELCOME TO ATM       ");
        System.out.println("==========================");

        System.out.print("Enter your PIN: ");
        int pin = w.nextInt();

        while(pin != 1234){System.out.println("Incorrect PIN. Try again.");
        System.out.print("Enter your PIN: ");
        pin = w.nextInt();
    }System.out.println("Login Successfully!");
    while (true) {
         System.out.println("--------------------------");
         System.out.println("       MAIN MENU        ");
         System.out.println("--------------------------");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("\nEnter your choice: ");
              int choice = w.nextInt();

              switch(choice){
                case 1 : System.out.printf("\nYour current balance is: %.0f\n",balance); break;
                case 2 : System.out.print("Enter amount of deposit: ");
                double deposit = w.nextDouble();
                balance += deposit;
                System.out.printf("\nNew balance: %.0f\n" , balance); break;
                case 3 : System.out.print("Enter amount to withdraw: ");
                double withdraw = w.nextDouble();
                balance -= withdraw;
                System.out.printf("\nNew balance: %.0f\n" , balance); break;
                case 4 : System.out.println("Thanks for using our ATM! Goodbye!"); return;
              }
        
    }

                
              
    
    }
}
