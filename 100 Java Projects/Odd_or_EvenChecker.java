import java.util.Scanner;
public class Odd_or_EvenChecker {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = w.nextInt();

        if(number % 2 == 0){System.out.println("Even number");}
        else{System.out.println("Odd Number");}
        w.close();
    }
}
