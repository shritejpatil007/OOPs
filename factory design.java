//  Implement Factory design pattern for the given context. Consider Car building 
// process, which requires many steps from allocating accessories to final makeup. 
// These steps should be written as methods and should be called while creating an 
// instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car 
// class. Car class and its subclasses, CarFactory and Test Factory Pattern should be 
// implemented.


// Base class for Car
abstract class Car {
    protected String type;

    public Car() {
        this.type = this.getClass().getSimpleName();
    }

    // Steps in the car building process
    public void allocateAccessories() {
        System.out.println("Allocating accessories for " + type);
    }

    public void assembleBody() {
        System.out.println("Assembling body for " + type);
    }

    public void installEngine() {
        System.out.println("Installing engine for " + type);
    }

    public void paintCar() {
        System.out.println("Painting " + type);
    }

    public void finalMakeup() {
        System.out.println("Final makeup for " + type);
    }

    // Method to build the car
    public void buildCar() {
        allocateAccessories();
        assembleBody();
        installEngine();
        paintCar();
        finalMakeup();
        System.out.println(type + " is built successfully!\n");
    }
}

// Subclass for Hatchback
class Hatchback extends Car {
    public Hatchback() {
        super();
    }
}

// Subclass for Sedan
class Sedan extends Car {
    public Sedan() {
        super();
    }
}

// Subclass for SUV
class SUV extends Car {
    public SUV() {
        super();
    }
}

// Factory class to create Car instances
class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "hatchback":
                return new Hatchback();
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}

// Test class to demonstrate the Factory Pattern
public class TestFactoryPattern {
    public static void main(String[] args) {
        // Create a Hatchback
        Car hatchback = CarFactory.createCar("hatchback");
        hatchback.buildCar();

        // Create a Sedan
        Car sedan = CarFactory.createCar("sedan");
        sedan.buildCar();

        // Create an SUV
        Car suv = CarFactory.createCar("suv");
        suv.buildCar();
    }
}