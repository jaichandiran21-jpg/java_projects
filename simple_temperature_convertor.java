import java.util.Scanner;

public class simple_temperature_convertor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.printf("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.printf("Conver to celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C"))? (temp * 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("%.1f°%s", newtemp, unit);

        scanner.close();

    }
}
