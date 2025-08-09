import java.util.Random;
import java.util.Scanner;
public class Dice_Roll_Simulator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        Random e = new Random();
        boolean game = true;

        int numbers = e.nextInt(6)+1;


        System.out.println("=== Dice Roll Simulator ===");
        System.out.print("Press Enter to roll the dice...");
        w.nextLine();
        System.out.println("\nYou rolled: " + numbers);

        while(game){
         System.out.print("Do you want to roll again? (y/n): ");
         String decision = w.next();

         if(decision.equalsIgnoreCase("n")){System.out.println("Thanks for playing."); break;}
         else if(decision.equalsIgnoreCase("y")){
         int numbers2 = e.nextInt(6)+1;
         System.out.println("You rolled: " + numbers2);}
         else{System.out.println("Invalid input. Try again.");}}
         w.close();
 }
}