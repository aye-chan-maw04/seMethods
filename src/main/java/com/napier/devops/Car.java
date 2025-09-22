package com.napier.devops;

public class Car {

    // Attributes (fields) of the class
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize the Car object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car("Toyota", "Corolla", 2023);

        // Call a method on the object
        myCar.displayInfo();

        // Update the brand
        myCar.setBrand("Honda");

        // Display updated information
        System.out.println("\nAfter updating brand:");
        myCar.displayInfo();
    }
}
