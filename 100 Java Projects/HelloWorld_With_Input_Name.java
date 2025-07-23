import java.util.Scanner;
public class HelloWorld_With_Input_Name {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = w.nextLine();

        System.out.println("Hello World " + name + "!"); 
        w.close();
    }
}
