//  Implement a program to handle Arithmetic exception, Array Index Out of Bounds. 
// The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is 
// displayed. If Num1 and Num2 are not integers, the program would throw a Number 
// Format Exception. If Num2 were zero, the program would throw an Arithmetic 
// Exception. Display the exception.


import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user for input
            System.out.print("Enter the first number (Num1): ");
            String inputNum1 = scanner.nextLine();
            System.out.print("Enter the second number (Num2): ");
            String inputNum2 = scanner.nextLine();

            // Parse the input to integers
            int num1 = Integer.parseInt(inputNum1);
            int num2 = Integer.parseInt(inputNum2);

            // Perform division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
