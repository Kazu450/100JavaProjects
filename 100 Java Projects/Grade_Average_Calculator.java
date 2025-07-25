import java.util.Scanner;

public class Grade_Average_Calculator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

    System.out.print("English: ");
    float english = w.nextFloat();
    System.out.print("Math: ");
    float math = w.nextFloat();
    System.out.print("Science: ");
    float science = w.nextFloat();
    System.out.print("Programming: ");
    float programming = w.nextFloat();

    float total = (english + math + science + programming) /4;
    System.out.println("Average Grade: " + total);
    if(total > 75){System.out.println("You Passed!");}
    else{System.out.println("You Failed.");}

    }
}
