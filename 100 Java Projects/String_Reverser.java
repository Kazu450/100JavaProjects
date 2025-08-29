import java.util.Scanner;
public class String_Reverser {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String nonreverse = w.nextLine();
        StringBuilder reverse = new StringBuilder(nonreverse);

       reverse.reverse();
       System.out.println("Reversed string: " + reverse);
    }
}
