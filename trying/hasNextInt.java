import java.util.Scanner;
public class hasNextInt {
    public static void main(String[] args) {

        Scanner w = new Scanner(System.in);

        System.out.print("Enter number: ");
        if(w.hasNextInt()){
            int number = w.nextInt();System.out.println("Your Number " + number);}
            else{System.out.println("That's not a number!");}

        }
        
        
    }

