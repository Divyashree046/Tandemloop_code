
/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/
package package1;

import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problem1 calculator = new Problem1();
        
        System.out.println("Simple Calculator");
        System.out.println("Operations available: add, subtract, multiply, divide");
        
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter operation type: ");
        String operation = scanner.next();
        
        try {
            double result = calculator.calculate(a, b, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public double calculate(double a, double b, String operation) {
        operation = operation.toLowerCase().trim();
        
        switch(operation) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation. Please choose 'add', 'subtract', 'multiply', or 'divide'.");
        }
    }
    
    private double add(double a, double b) {
        return a + b;
    }
    
    private double subtract(double a, double b) {
        return a - b;
    }
    
    private double multiply(double a, double b) {
        return a * b;
    }
    
    private double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
