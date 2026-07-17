import java.util.Random;
import java.util.Scanner;

public class slot_machine {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String[] row;
        String playagain;

        System.out.println("Welcom to Slot ");
        System.out.println("Symbols: 🙈 🙉 🙊 🐵 💀 ");

        while(balance > 0){
            System.out.println("Current balance: ₹" + balance);
            System.out.print("Your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("**INSUFFICIENT BALANCE**");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Amount must be greater than '0' ");
                continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Spinning......");
            row = spinrow();
            printrow(row);
            payout = getpayout(row, bet);

            if(payout > 0){
                System.out.println("You won ₹" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you Lose!!");
            }

            System.out.print("Do you want Play Agian ? (Y/N): ");
            playagain = scanner.nextLine().toUpperCase();

            if(!playagain.equals("Y")){
                break;
            }
        }

        System.out.println("GAME OVER!! Your final balance is ₹" + balance );
        scanner.close();
    }
    static String[] spinrow(){

        String[] symbols = {"🙈", "🙉", "🙊", "🐵", "💀"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printrow(String[] row){

        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getpayout(String [] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🙈" -> bet * 3;
                case "🙉" -> bet * 4;
                case "🙊" -> bet * 5;
                case "🐵" -> bet * 10;
                case "💀" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🙈" -> bet * 2;
                case "🙉" -> bet * 3;
                case "🙊" -> bet * 4;
                case "🐵" -> bet * 5;
                case "💀" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🙈" -> bet * 2;
                case "🙉" -> bet * 3;
                case "🙊" -> bet * 4;
                case "🐵" -> bet * 5;
                case "💀" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
