// Calculator.java
public class Calculator {
    public static void main(String[] args) {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        CalculatorUI calculatorUI = new CalculatorUI(calculatorEngine);
        calculatorUI.start();
    }
}
