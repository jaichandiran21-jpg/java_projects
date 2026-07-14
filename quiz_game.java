import java.util.Scanner;

public class quiz_game {

    public static void main(String[] args){

        String[] questions = {
                "What is the main function of a router?",
                "Which part of he computer is considered the brain?",
                "What year was Facebook lanched?",
                "Who is known as the father of computer?",
                "What was the first programming languages?",
                "What is easy langauge for beginner?",
                "What is the full form of OOP?",
                "What is the full form of DBMS?",
        };

        String [][] options = {
                {"1. Storing files", "2.Encrypting data", "3.Directing internet traffic", "4.Managing password"},
                {"1.CPU","2.RAM","3.SSD","4.GPU"},
                {"1.2003","2.2004","3.2001","4.2006"},
                {"1.Setve jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                {"1.COBOl","2.'C'","3.Fortran","4.JAVA"},
                {"1.'C'","2.Python","3.C++","4.JAVA"},
                {"1.Object Oriented Programing","2.Objects On Programming","3.Object OS program","4.Object Operates Paths"},
                {"1.Data Backup Management System","2.Data Byte Manipulation System","3.Data Based Manipulate System","4.Database Management System"},
        };

        int[]answers = {3,1,2,4,3,2,1,4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("Welcome to my Quiz Game");
        System.out.println("-----------------------");
        System.out.println();

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!!!!");
                score++;
            }
            else{
                System.out.println("Wrong**");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);


        scanner.close();

    }
}
