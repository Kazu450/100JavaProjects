import java.util.Scanner;
public class Kilometer_to_Mile_Converter {
    public static void main(String[]args ){
        Scanner w = new Scanner(System.in);

        System.out.println("=== Kilometer to Mile Converter ===");
        System.out.print("Enter distance in kilometers: ");
        double kilometers = w.nextDouble();

        double miles = kilometers * 0.621371;


        System.out.printf("%.2f kilometers is equal to %.2f miles%n" , kilometers , miles);

        System.out.println("Hello World");

        w.close();
}}
