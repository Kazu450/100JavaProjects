import java.util.Scanner;
public class Multiplication_Table_Generator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = w.nextInt();

        for(int i = 1; i < 10 + 1; i++){
            System.out.println(number + " x " + i + " = " + i * number);
            
        } w.close();
    }
    
}
