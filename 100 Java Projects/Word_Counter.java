import java.util.Scanner;
public class Word_Counter {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = w.nextLine();

        String [] counter =  sentence.trim().split("\\s+");

        System.out.println("Number of words: " + counter.length);
        w.close();
    }
}
