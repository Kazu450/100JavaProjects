import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        int weight = w.nextInt();
        System.out.print("Enter height (cm): ");
        float height = w.nextFloat();

        float bmi = weight / ((height / 100) * (height / 100));

        System.out.printf("Your BMI is: %.1f\n" , bmi);

        if(bmi < 16.3){System.out.println("You are in Underweight.");}
        else if(bmi < 22.2){System.out.println("You are in the Normal weight range");}
        else if(bmi < 27.8){System.out.println("You are Overweight.");}
        else{System.out.println("You are in the Obese range.");}

        w.close();
    
    
    
    }
}
