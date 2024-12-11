// Design a base class shape with two double type values and member functions to 
// input the data and compute_area() for calculating area of shape. Derive two classes: 
// triangle and rectangle. Make compute_area() as abstract function and redefine this 
// function in the derived class to suit their requirements. Write a program that accepts 
// dimensions of triangle/rectangle and display calculated area. Implement dynamic 
// binding for given case study.

import java.util.Scanner;

// Abstract base class
abstract class Shape {
    protected double dimension1;
    protected double dimension2;

    // Method to input dimensions
    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension 1: ");
        dimension1 = scanner.nextDouble();
        System.out.print("Enter dimension 2: ");
        dimension2 = scanner.nextDouble();
    }

    // Abstract method to compute area
    public abstract double compute_area();
}

// Derived class for Triangle
class Triangle extends Shape {
    @Override
    public double compute_area() {
        // Area of triangle = 0.5 * base * height
        return 0.5 * dimension1 * dimension2;
    }
}

// Derived class for Rectangle
class Rectangle extends Shape {
    @Override
    public double compute_area() {
        // Area of rectangle = length * width
        return dimension1 * dimension2;
    }
}

// Main class to test the implementation
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.print("Enter 1 for Triangle or 2 for Rectangle: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            shape = new Triangle();
            System.out.println("You chose Triangle.");
        } else if (choice == 2) {
            shape = new Rectangle();
            System.out.println("You chose Rectangle.");
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Input dimensions
        shape.inputDimensions();

        // Calculate and display area
        double area = shape.compute_area();
        System.out.println("The area is: " + area);
    }
}