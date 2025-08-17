import java.util.Scanner;

public class Time_Converter {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("---Time Converter---");
        long seconds = getSeconds(w);

        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secondsLeft = seconds % 60;

        System.out.printf("Converted time: %02d:%02d:%02d%n", hours, minutes, secondsLeft); w.close();
    }

    public static long getSeconds(Scanner w) {
        System.out.print("Enter time in seconds: ");
        if (!w.hasNextLong()) {
            System.out.println("Please enter a number only.");
            w.next();
            return getSeconds(w);
        }
        return w.nextLong();
        
    }
}
