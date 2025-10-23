public class Calculator {

    // add methods - method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // multiplication
    double multiply(double a, double b) {
        return a * b;
    }

    // division with error handling
    double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
