// Addition.java
public class Addition {
    public double operate(double num1, double num2) {
        return num1 + num2;
    }
}

// Subtraction.java
public class Subtraction {
    public double operate(double num1, double num2) {
        return num1 - num2;
    }
}

// Multiplication.java
public class Multiplication {
    public double operate(double num1, double num2) {
        return num1 * num2;
    }
}

// Division.java
public class Division {
    public double operate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
