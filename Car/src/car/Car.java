package car;

public class Car {
    // Class properties
    private String color;
    private String model;
    private int year;
    private boolean isRunning;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color; // 'this' refers to the instance variable 'color'
        this.model = model; // 'this' refers to the instance variable 'model'
        this.year = year;   // 'this' refers to the instance variable 'year'
        this.isRunning = false; // Initially, the car is not running
    }

    // Method to start the car
    public void start() {
        if (!this.isRunning) { // 'this' refers to the instance variable 'isRunning'
            this.isRunning = true;
            System.out.println("The car has started.");
        } else {
            System.out.println("The car is already running.");
        }
    }

    // Method to stop the car
    public void stop() {
        if (this.isRunning) { // 'this' refers to the instance variable 'isRunning'
            this.isRunning = false;
            System.out.println("The car has stopped.");
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Color: " + this.color); // 'this' refers to the instance variable 'color'
        System.out.println("Model: " + this.model); // 'this' refers to the instance variable 'model'
        System.out.println("Year: " + this.year);   // 'this' refers to the instance variable 'year'
        System.out.println("Running: " + (this.isRunning ? "Yes" : "No")); // 'this' refers to the instance variable 'isRunning'
    }

    // Main method to create and interact with the Car object
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Red", "Toyota", 2020);

        // Displaying car details
        myCar.displayInfo();

        // Starting the car
        myCar.start();

        // Displaying car details after starting
        myCar.displayInfo();

        // Stopping the car
        myCar.stop();

        // Displaying car details after stopping
        myCar.displayInfo();
    }
}
