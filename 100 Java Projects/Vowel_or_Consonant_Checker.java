import java.util.Scanner;
public class Vowel_or_Consonant_Checker {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = w.next();

        if(input.length() != 1){System.out.println("Invalid input. Please enter only one letter.");
    }else{char letter = input.charAt(0);
    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){System.out.println(letter + " is a vowel.");}
     else{System.out.println(letter + " is a consonant.");}
}

    }

}
