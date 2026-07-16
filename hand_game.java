import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class hand_game {

    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       String[] choice = {"rock","paper","scissors"};
       String playerch;
       String compch;
       String playagain = "Yes";

       do{

           System.out.print("Enter your move (Rock, Paper, Scissors): ");
           playerch = scanner.nextLine().toLowerCase();

           if(!playerch.equals("rock") &&
                   !playerch.equals("paper") &&
                   !playerch.equals("scissors")){

               System.out.println("***INVALID CHOICE***");
               continue;
           }

           compch = choice[random.nextInt(3)];
           System.out.println("Computer choice: " + compch);

           if(playerch.equals(compch)){
               System.out.println("It is a tie");
           }
           else if(playerch.equals("rock") && compch.equals("scissors") ||
                   (playerch.equals("paper") && compch.equals("rock")) ||
                   playerch.equals("scissors") && compch.equals("paper")){
               System.out.println("You Won!!");
           }
           else{
               System.out.println("You lose!");
           }

           System.out.print("Play agian(Yes/No): ");
           playagain = scanner.nextLine().toLowerCase();


       }while(playagain.equals("yes"));

        System.out.println("Thank for palying");

        scanner.close();

    }
}
