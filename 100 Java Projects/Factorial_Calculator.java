import java.util.Scanner;
public class Factorial_Calculator {
public static void main(String[] args) {
    Scanner w = new Scanner(System.in);


    System.out.println("=== Factorial Calculator ===");

    System.out.print("Enter a non-negative integer: ");
    int input = w.nextInt();
    int total = 1;

    for(int i = 1; i <= input; i++){total = total * i;}
    System.out.println("The factorial of " + input + " is " + total);

}
}
