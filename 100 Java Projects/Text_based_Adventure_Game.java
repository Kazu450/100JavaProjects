import java.util.Scanner;
public class Text_based_Adventure_Game {
    public static void main (String [] args ){

        Scanner w = new Scanner(System.in);
        boolean nar = false;
        boolean sas = false;

        System.out.println("Naruto vs Sasuke");

        System.out.print("Choose a character between Naruto and Sasuke: ");
        String character = w.nextLine();
        if(character.equalsIgnoreCase("Naruto")){nar = true;}
    else if(character.equalsIgnoreCase("Sasuke")){sas = true;}
    else{System.out.println("Choose between Naruto and Sasuke only.");}

    while(nar){System.out.println("You're Naruto and Sasuke is on the other side ready to fight.");
    System.out.print("Are you gonna attack first? y/n: ");
    String first = w.next();
    if(first.equalsIgnoreCase("y")){System.out.print("What attack are you gonna use? \nA.Rasengan \nB.Tailed Beast Bomb \nC.Shadow Clone \nChoose between A-C: ");
    String firstattack = w.next();

    if(firstattack.equalsIgnoreCase("A")){System.out.println("You rushed to Sasuke with your Rasenggan but he quickly dodge it, Sasuke is ready to use his Chidori, what are you gonna do?");
System.out.println("A. Dodge and kick Sasuke's ball");
System.out.println("B. Fart on Sasuke's face");
System.out.println("C. Accept it");
System.out.print("Choose between A-C: ");
String attack2 = w.next();
if(attack2.equalsIgnoreCase("A")){System.out.println("You kicked Sasuke's ball really hard and from that he died. \nCongratiolations You Win!");}
else if(attack2.equalsIgnoreCase("B")){System.out.println("You farted on Sasuke's face and from that he died. \nCongratiolations You Win!");}
else if(attack2.equalsIgnoreCase("C")){System.out.println("You accept it. Sasuke use his chidori in your chest and from that you died. \nYou Lost.");}
}
else if(firstattack.equalsIgnoreCase("B")){System.out.println("You used Tailed Beast Bomb on Sasuke and that attack is crazy powerful so he got 1 shot. \nCongratiolations You Win!");
}
else if(firstattack.equalsIgnoreCase("C")){System.out.println("You used Shadow Clone Jutsu and you rushed to Sasuke but he used his fireball jutsu towards you. \nWhat are you gonna do?");
System.out.println("A. Eat it");
System.out.println("B. Dodge and continue to rush");
System.out.println("C. Accept it");
System.out.print("Choose between A-C: ");
String secondattack = w.next();
if(secondattack.equalsIgnoreCase("A")){System.out.println("You tried to eat the fireball jutsu but you died. \nYou Lost.");}
else if(secondattack.equalsIgnoreCase("B")){System.out.println("You successfully dodge the fireball jutsu and you continued to rush \nWhat's your next move?");
System.out.println("A. Punch Sasuke together with your clones");
System.out.println("B. Dance on Sasuke together with your clones");
System.out.println("C. Rasengan together with your clones");
System.out.print("Choose between A-C: ");
String thirdattack = w.next();
if(thirdattack.equalsIgnoreCase("A")){System.out.println("Before you even try to punch Sasuke with all your clones, you're already under his genjutsu and from that, you died \nYou Lost.");}
else if(thirdattack.equalsIgnoreCase("B")){System.out.println("You dance in front of Sasuke and from that he fell in love. \nWhat kind of ending is that?");}
else if(thirdattack.equalsIgnoreCase("C")){System.out.println("You used Rasengan to Sasuke and he failed to dodge it and he got 1 shot. \nCongratulations! You Win!");}
}else if(secondattack.equalsIgnoreCase("C")){System.out.println("You just accepted Sasuke's fireball jutsu, and from that you died. \nYou Lost.");}}

} else if(first.equalsIgnoreCase("n")){System.out.println("Sasuke used his Ameterasu towards you and from that, you died. \nDumbass! dont be a pussy!");}
else{System.out.println("Choose between y and n only.");} break;
}


while(sas){System.out.println("You're Sasuke and Naruto is on the other side ready to fight.");
System.out.print("Are you gonna attack first? y/n: ");
String first = w.next();
if(first.equalsIgnoreCase("y")){System.out.println("What are you gonna use?");
System.out.println("A. Chidori");
System.out.println("B. Amaterasu");
System.out.println("C. Fireball Jutsu");
System.out.print("Choose between A-C: ");
String first1 = w.next();
if(first1.equalsIgnoreCase("A")){System.out.println("You rushed to Naruto using Chidori and you hit him but it's just a clone and Naruto now is behind you with Rasengan. \nWhat are you gonna do?");
System.out.println("A. Amaterasu");
System.out.println("B. Accept it");
System.out.println("C. Chidori");
System.out.print("Choose between A-C: ");
String first2 = w.next();
if(first2.equalsIgnoreCase("A")){System.out.println("You used Amaterasu on Naruto and from that, he died. \nCongratulations You Win!");}
else if(first2.equalsIgnoreCase("B")){System.out.println("You accepted Naruto's Rasengan on your face and from that, you died. \nYou Lost.");}
else if(first2.equalsIgnoreCase("C")){System.out.println("You used Chidori but before you even do that you already got one shot by Naruto's Rasengan and from that, you died. \nYou Lost.");}

}else if(first1.equalsIgnoreCase("B")){System.out.println("You used Amaterasu on Naruto and before he can even rock he already got hit, and from that he died. \nCongratulations You Win!");}
else if(first1.equalsIgnoreCase("C")){System.out.println("You used Fireball Jutsu on Naruto but he just dodge it and Naruto is now ready to use Bijuu Rasenshuriken. \nWhat are you gonna do?");
System.out.println("A. Fireball Jutsu");
System.out.println("B. Indra's Arrow");
System.out.println("C. Dodge");
System.out.print("Choose between A-C: ");
String first3 = w.next();
if(first3.equalsIgnoreCase("A")){System.out.println("You used Fireball Jutsu but the Bijuu Rasenshuriken is too strong, and from that you died. \nYou Lost.");}
else if(first3.equalsIgnoreCase("B")){System.out.println("You used your most powerful the Indra's Arrow but the result is tie, and from that you got the real ending. \nYou Got the real ending of Naruto Series!");}
else if(first3.equalsIgnoreCase("C")){System.out.println("You tried to dodge it but the Bijuu Rasenshuriken is so fast, and from that you died. \nYou Lost.");}
}
}
else if(first.equals("n")){System.out.println("Naruto used his Bijuu Rasenshuriken and from that you got one shot. \nYou Lost.");}
else{System.out.println("Choose only between y and n.");} break;} w.close();
    }
}
