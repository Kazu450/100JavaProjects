import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

       Random randnumb = new Random();
       int number = randnumb.nextInt(1,11);

        System.out.print("Guess the number: ");
        int guess = w.nextInt();
        if(guess == number){System.out.println("Correct!");}
        else if(guess > number){System.out.println("Too High! THE CORRECT NUMBER IS " + number);}
        else{System.out.println("Too Low! THE CORRECT NUMBER IS " + number);}
        w.close();
    }
}
