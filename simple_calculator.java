import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validop = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator(+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case'+' -> result = num1 + num2;
            case'-' -> result = num1 - num2;
            case'*' -> result = num1 * num2;
            case'/' -> {
                if (num2 ==0){
                    System.out.println("Can zero is divided by any number ??");
                    validop = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case'^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("**Invalid operator**");
                validop = false;
            }
        }

        if(validop){
            System.out.println(result);
        }

        scanner.close();

    }
}
