import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = w.nextInt();
        System.out.print("Enter second number: ");
        int second = w.nextInt();
        System.out.print("Choose operation (+, -, *, /): ");
        String operation = w.next();
        

        switch(operation){
            case "+":
            System.out.println("Result: " + (first + second));
            break;
             case "-":
            System.out.println("Result: " + (first - second));
            break;
             case "*":
            System.out.println("Result: " + (first * second));
            break;
             case "/":
           if(second !=0){System.out.println(first / second);}
           else{System.out.println("Cannnot Devide to zero.");}
            break;

            default:
            System.out.println("Invalid operation.");
            break;
            
        }

        

    }
}
