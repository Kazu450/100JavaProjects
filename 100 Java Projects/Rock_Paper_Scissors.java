import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        Random e = new Random();
        boolean game = true;
        int player1 = 0;
        int player2 = 0;

        System.out.println("=== Rock Paper Scissors ===");

        while(game){
             
            String[] choices = {"rock", "paper", "scissors"};
        String computer = choices[e.nextInt(3)];

            System.out.print("Enter your choice (rock, paper, scissors): ");
            String choice = w.nextLine();
            if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){}
            else{System.out.println("Invalid input."); continue;}
            System.out.println("Computer chose: " + computer);
            if(choice.equals("rock")&& computer.equals("paper")){System.out.println("You lose!"); player2++;}
        else if(choice.equals("paper")&& computer.equals("scissors")){System.out.println("You lose!"); player2++;}
        else if(choice.equals("scissors")&& computer.equals("rock")){System.out.println("You lose!");player2++;}
        else if(choice.equals("rock")&& computer.equals("scissors")){System.out.println("You win!"); player1++; }
        else if(choice.equals("paper")&& computer.equals("rock")){System.out.println("You win!"); player1++;}
        else if(choice.equals("scissors")&& computer.equals("paper")){System.out.println("You win!");player1++;}
        else if(choice.equals(computer))System.out.println("Tie!");

        System.out.println("Player Score: " + player1);
        System.out.println("Computer Score: " + player2);

        while(true){
            System.out.print("Do you want to play again? (y/n): ");
        String play = w.nextLine();
        if(play.equals("y")){break;}
        else if(play.equals("n")){System.out.println("Thanks for playing.");  game = false; break;}
        else{System.out.println("Invalid choice"); continue;}
        }
        

        }
        
        

    }
}
