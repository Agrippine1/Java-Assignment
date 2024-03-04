
package q10culculator;
import java.util.Scanner;

class Calculator {
    public Calculator() {
        // Constructor
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not-a-Number
        } else {
            return num1 / num2;
        }
    }
}

public class Q10culculator {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Addition: " + Calculator.add(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));
        System.out.println("Division: " + Calculator.divide(num1, num2));

        scanner.close();
        
    }
    
}
