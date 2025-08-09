import java.util.Scanner;
public class Day_of_the_Week {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("=== Day of the Week Finder ===");
        System.out.print("Enter a number (1-7): ");
        int day = w.nextInt();

        switch(day){
            case 1 : System.out.println("The day is: Monday"); break;
            case 2 : System.out.println("The day is: Tuesday"); break;
            case 3 : System.out.println("The day is: Wednesday"); break;
            case 4 : System.out.println("The day is: Thursday"); break;
            case 5 : System.out.println("The day is: Friday"); break;
            case 6 : System.out.println("The day is: Saturday"); break;
            case 7 : System.out.println("The day is: Sunday"); break;

            default : System.out.println("Invalid day."); break;
        }   w.close();
    }
}
