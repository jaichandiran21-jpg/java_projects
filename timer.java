import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;

public class timer {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of second to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if(count <0){
                    System.out.println("HAPPY NEW YEAR!!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
