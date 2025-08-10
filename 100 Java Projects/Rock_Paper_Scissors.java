import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        Random e = new Random();
        boolean game = true;
        
        String[] choices = {"rock", "paper", "scissors"};
        String computer = choices[e.nextInt(3)];

        System.out.println("=== Rock Paper Scissors ===");

        while(game){
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String choice = w.nextLine();
            if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){}
            else{System.out.println("Invalid input."); continue;}
            System.out.println("Computer chose: " + computer);
            if(choice.equals("rock")&& computer.equals("paper")){System.out.println("You lose!");}
        else if(choice.equals("paper")&& computer.equals("scissors")){System.out.println("You lose");}
        else if(choice.equals("scissors")&& computer.equals("rock")){System.out.println("You lose");}
        else if(choice.equals("rock")&& computer.equals("scissors")){System.out.println("You win");}
        else if(choice.equals("paper")&& computer.equals("rock")){System.out.println("You win");}
        else if(choice.equals("scissors")&& computer.equals("paper")){System.out.println("You lose");}
        else if(choice.equals(computer))System.out.println("Tie!");

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
