import java.util.Scanner;
public class Password_Strength_Checker {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("\n=== Password Strength Checker ===\n");

        System.out.print("Enter your password: ");
        String password = w.nextLine();

        System.out.println("Analyzing...");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        boolean lengths = password.length() >= 8;

        System.out.println("Password length: " + password.length() + " characters");

        boolean letters = false;
       
        for(int i = 0; i < password.length(); i++){
           if(Character.isUpperCase(password.charAt(i))){letters = true; break;}
          
        }if(letters){System.out.println("Contains Uppercase Letters: Yes");}
          else{System.out.println("Contains Uppercase Letters: No");}

        boolean letters2 = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isLowerCase(password.charAt(i))){letters2 = true; break;}
        }if(letters2){System.out.println("Contains Lowercase Letter: Yes");}
        else{System.out.println("Contains Lowercase Letter: No");}

        boolean hasnumbers = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){hasnumbers = true; break;}
        }if(hasnumbers){System.out.println("Contains Numbers: Yes");}
        else{System.out.println("Contains Numbers: No");}
        
        boolean special = false;
        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetter(password.charAt(i))&& !Character.isDigit(password.charAt(i))){special = true; break;}
        }if(special){System.out.println("Contains Special Characters: Yes");}
        else{System.out.println("Contains Special Characters: No");}
        
        if(lengths && letters && letters2 && hasnumbers && special){System.out.println("Password Strength: STRONG");}
        else if(lengths && letters && letters2 && hasnumbers && !special){System.out.println("Password Strength: MODERATE\nTip: Add special characters to make it stronger.");}
        else{ System.out.print("Password Strength: WEAK\nTip: ");
    if (!lengths) System.out.print("Make it at least 8 characters long. ");
    if (!letters) System.out.print("Add uppercase letters. ");
    if (!letters2) System.out.print("Add lowercase letters. ");
    if (!hasnumbers) System.out.print("Add numbers. ");
    if (!special) System.out.print("Add special characters. \n");}
    w.close();
    }
}
