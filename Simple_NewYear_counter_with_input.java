import java.util.Scanner;

public class Sample_NewYear_counter_with_input {
    public static void main(String[] args)throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to coundown form: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!");

    }
}
