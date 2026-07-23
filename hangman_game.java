import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman_game {
    public static void main(String[] args) {

        String filpath = "game_word.text";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filpath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could no find file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < word.length(); i++) {
            wordstate.add('_');
        }

        System.out.println("Welcome to Hangman!!");
        System.out.print("Word: ");

        while (wrongGuess < 7) {
            System.out.println(gethangman(wrongGuess));

            for (char c : wordstate) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!!\n");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordstate.set(i, guess);
                    }
                }
                if(!wordstate.contains(('_'))){
                    System.out.print(gethangman((wrongGuess)));
                    System.out.println("YOU WON!!!");
                    System.out.println("The word was " + word);
                    break;
                }
            }
            else {
                wrongGuess++;
                System.out.println("Worng guess;\n");
            }
        }
        if (wrongGuess >=7){
            System.out.print(gethangman((wrongGuess)));
            System.out.print("GAME OVER!!!");
            System.out.println("The word was: " + word);
        }
            scanner.close();
    }
    static String gethangman(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    0
                    
                    
                    """;
            case 2 -> """
                    0
                    |
                    
                    """;
            case 3 -> """
                     0
                    /|
                    
                    """;
            case 4 -> """
                     0
                    /|\\
                    
                    """;
            case 5 -> """
                     0
                    /|\\
                    / 
                    """;
            case 6 -> """
                     0
                    /|\\
                    / \\
                    """;
            default -> " ";

        };
    }
}

