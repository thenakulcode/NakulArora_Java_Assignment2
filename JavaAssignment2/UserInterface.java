// UserInterface.java
// Menu-driven calculator that uses the Calculator class

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Calculator calc = new Calculator();

    // Addition method
    public void performAddition() {
        System.out.println("Choose addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int a = sc.nextInt(), b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
                break;
            case 2:
                System.out.print("Enter two doubles: ");
                double x = sc.nextDouble(), y = sc.nextDouble();
                System.out.println("Result: " + calc.add(x, y));
                break;
            case 3:
                System.out.print("Enter three integers: ");
                int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
                System.out.println("Result: " + calc.add(p, q, r));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Subtraction
    public void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // Multiplication
    public void performMultiplication() {
        System.out.print("Enter two doubles: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // Division
    public void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        try {
            System.out.println("Result: " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // Menu and control
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1: performAddition(); break;
                    case 2: performSubtraction(); break;
                    case 3: performMultiplication(); break;
                    case 4: performDivision(); break;
                    case 5: System.out.println("Exiting... Thank you!"); break;
                    default: System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
                sc.next(); // clear invalid input
                choice = 0;
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        new UserInterface().mainMenu();
    }
}
