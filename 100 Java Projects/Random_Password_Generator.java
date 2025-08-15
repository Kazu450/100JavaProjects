    import java.util.Random;
    import java.util.Scanner;
    public class Random_Password_Generator {
        public static void main(String[] args) {
            Scanner w = new Scanner(System.in);
            Random e = new Random();

            String bigletter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String smallletter = "abcdefghijklmnopqrstuvwxyz";
            String number = "0123456789";
            String special = "!@#$%^&*()-_=+<>?";
            boolean access = true;
            boolean access2 = true;

            String password = bigletter + smallletter + number + special;

            while(access){System.out.println("=== Random Password Generator ===\n");
            System.out.print("Enter the desired password length: ");
            if(!w.hasNextInt()){System.out.println("Type the number only!"); w.nextLine(); continue;}
            int desired = w.nextInt();
            w.nextLine();
            StringBuilder finalpass = new StringBuilder();
            for(int i = 0; i < desired; i++){
                int index = e.nextInt(password.length());
                finalpass.append(password.charAt(index));
            }
            System.out.println("Your random password is: " + finalpass);

            while(access2){System.out.print("Do you want to generate another password? (yes/no): ");
            String decision = w.nextLine();
            if(decision.equalsIgnoreCase("yes")){ break;}
            else if(decision.equalsIgnoreCase("no")){System.out.println("Thank you for using the Random Password Generator!"); access = false; break; }
            else{System.out.println("Choose yes or no only!");}}
        } 
        }
    }
