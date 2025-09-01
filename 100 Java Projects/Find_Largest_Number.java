import java.util.Scanner;
public class Find_Largest_Number {
    public static void main (String [] args ){
        Scanner w = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = w.nextInt();
         System.out.print("Enter second number: ");
        int second = w.nextInt();
         System.out.print("Enter third number: ");
        int third = w.nextInt();

        if(first > second && first > third){System.out.println("The largest number is: " + first);}
        else if(second > first && second > third){System.out.println("The largest number is: " + second);}
        else if(third > second && third > first){System.out.println("The largest number is: " + third);}
        else if(first == second && second == third){System.out.println("All numbers are equal.");}

        w.close();
    }
}
