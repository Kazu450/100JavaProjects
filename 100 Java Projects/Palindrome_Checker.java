import java.util.Scanner;
public class Palindrome_Checker {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = w.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);

        if(word.equalsIgnoreCase(reversed)){System.out.println(word + " is a palindrome");}
        else{System.out.println(word + " is not a palindrome");}

        w.close();

    }
    
}
