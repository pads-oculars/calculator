// CalculatorUI.java
import java.util.Scanner;

public class CalculatorUI {
    private CalculatorEngine calculatorEngine;

    public CalculatorUI(CalculatorEngine calculatorEngine) {
        this.calculatorEngine = calculatorEngine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operation (+, -, *, /) or 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Calculator is exiting. Goodbye!");
                break;
            }

            try {
                System.out.println("Enter first number:");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter second number:");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = performOperation(operation, num1, num2);
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private double performOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                return calculatorEngine.add(num1, num2);
            case "-":
                return calculatorEngine.subtract(num1, num2);
            case "*":
                return calculatorEngine.multiply(num1, num2);
            case "/":
                return calculatorEngine.divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
