import java.util.Scanner;
public class Login_System {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        String username = "kazuuchiha";
        String password = "kazu123";
        int attempt = 3;
        boolean result = false;

        
        while(attempt > 0){
            System.out.println("You have " + attempt + (attempt ==1 ? " chance" : " chances") + " to log in.");
        System.out.print("\nEnter Username: ");
        String user = w.nextLine();

        System.out.print("Enter Password: ");
        String pass = w.nextLine();
        
            if(user.equalsIgnoreCase(username)&&pass.equalsIgnoreCase(password)){result=true; break;}
            else{System.out.println("\nWrong username or password"); attempt--;}

        } if(result){System.out.println("\nLogin Successfully!");}
        else{System.out.println("\nLogin Failed.");}

        w.close();

    }
}
