import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Choose an operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
