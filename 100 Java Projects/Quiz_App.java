import java.util.Scanner;
public class Quiz_App {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("=== Welcome to the Quiz App ===");

        int question1 = 1;
        int question2 = 1;
        int question3 = 1;
        int score = 0;

        System.out.println("Question 1: What is the capital of France?");
        System.out.println("a) London");
        System.out.println("b) Berlin");
        System.out.println("c) Paris");
        System.out.println("d) Madrid");
        System.out.print("Your answer: ");
        String answer1 = w.next();
        if(answer1.equalsIgnoreCase("C")){System.out.println("Correct!"); score++;}
        else{System.out.println("Wrong.");}

        System.out.println("");

        System.out.println("Question 2: Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.println("d) Saturn");
        System.out.print("Your answer: ");
        String answer2 = w.next();
        if(answer2.equalsIgnoreCase("B")){System.out.println("Correct!"); score++;}
        else{System.out.println("Wrong.");}

        System.out.println("");

        System.out.println("Question 3: Who developed the Java programming language?");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.println("d) Oracle");
        System.out.print("Your answer: ");
        String answer3 = w.next();
        if(answer3.equalsIgnoreCase("B")){System.out.println("Correct!"); score++;}
        else{System.out.println("Wrong.");}

        System.out.println("=== Quiz Finished! ===");
        System.out.println("You got " + score + " out of 3 correct.");
        if(score == 3){System.out.println("Score: 100%"); System.out.println("Excellent!");}
        else if(score == 2){System.out.println("Score: 66%"); System.out.println("Good try! ");}
        else if(score == 1){System.out.println("Score: 33%"); System.out.println("Better luck next time!");}
        else if(score == 0){System.out.println("Score: 0%"); System.out.println("Don’t give up — try again!");}
    }
}
