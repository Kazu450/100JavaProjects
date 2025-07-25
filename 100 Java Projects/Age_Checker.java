import java.util.Scanner;
public class Age_Checker {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter your age: ");
        if(w.hasNextInt()){
            int age = w.nextInt();

            if(age > 17){System.out.println("Access granted. You are " + age + " or older.");}
            else{System.out.println("Access denied. You must be 18 or older.");}
 
        }else{System.out.println("That's not a valid number!");}
        w.close();
        
    }
}
