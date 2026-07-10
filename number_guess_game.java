import java.util.Scanner;
import java.util.Random;

public class number_guess_game {
    public static void main(String [] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;
        int ran_number = random.nextInt(min, max + 1);

        System.out.println("!!Number Guessing Game!!");
        System.out.printf("Guess a number between %d - %d\n" ,min ,max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempt++;

            if(guess < ran_number){
                System.out.println("Too Low! Try agian!!");
            }
            else if(guess > ran_number){
                System.out.println("Too High! Try agian!!");
            }
            else{
                System.out.println("Correcnt!! The number was "+ ran_number);
                System.out.println("# of attempts: " + attempt);
            }

        }while(guess != ran_number);

        scanner.close();
    }

}
