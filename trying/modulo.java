import java.util.Scanner;

public class m78odulo {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (w.hasNextInt()) {
            int number = w.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("That's not a number!");
        }

        w.close();
    }
}
