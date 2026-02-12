
import java.util.Scanner;

public class JavaCalc {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Calculator! ");

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            String choice = scanner.nextLine();

            if (choice.equals("5")) {
                System.out.println("Goodbye! 👋");
                break;
            }

            if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            try {
                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = 0;
                switch (choice) {
                    case "1":
                        result = add(num1, num2);
                        break;
                    case "2":
                        result = subtract(num1, num2);
                        break;
                    case "3":
                        result = multiply(num1, num2);
                        break;
                    case "4":
                        result = divide(num1, num2);
                        break;
                }

                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }

        scanner.close();
    }
}
