import java.util.Scanner;
public class Calculator {
    public static void main (String[]args) {
        Scanner scanner = new
        Scanner(System.in);
        double num1, num2;
        String operation;
        boolean continueCalculation = true;
        while (continueCalculation) {
            System.out.println("Enter an operation (+, -, *, /, exit):");
            operation = scanner.next();
            if
            (operation.equals("exit")) {
                continueCalculation = 
                false;
                continue;
            }
            System.out.println("Enter the first number:");
            num1 = scanner.nectDouble();
            System.out.println("Enter the second number:");
            num2 = scanner.nectDouble();
            double result = 0;
            switch (operation) {
                case "+":
                result = num1 + num2;
                break;
                case "-":
                    result = num1 - num2;
                    break;
                    case "*":
                        result = num1 * num2;
                        break;
                        case "/":
                            if (num2==0) {
                                System.out.println("Error: Division by zero!");
                                continue;
                            }
                            result = num1 / num2;
                            break;
                            default:
                                 System.out.println("invalid operation!");
                                 continue;
            }
            System.out.println("Result:" + result);
        }
        scanner.close();
        System.out.println("Calculator closed.");
    }
}