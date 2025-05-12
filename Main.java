// Nasser Alblooshi
// 784-2007-6290350-6
// 21103356
// 12CAI
// 17/01/2025

import java.util.ArrayList;

// PC3.5: Vehicle Class
class Vehicle {
    protected String brand;
    protected double pricePerDay;
    protected int rentalDays;

    public Vehicle(String brand, double pricePerDay, int rentalDays) {
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.rentalDays = rentalDays;
    }

    public double calculateRentalCost() {
        return pricePerDay * rentalDays;
    }

    // PC3.8: Overriding toString method
    @Override
    public String toString() {
        return "Vehicle - Brand: " + brand + ", Price Per Day: " + pricePerDay + 
        ", Rental Days: " + rentalDays;
    }

    // PC3.8: Overriding equals method
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Vehicle vehicle = (Vehicle) other;
        return Double.compare(vehicle.pricePerDay, pricePerDay) == 0 &&
               brand.equals(vehicle.brand);
    }
}

// PC3.5: Car Class
class Car extends Vehicle {
    public Car(String brand, double pricePerDay, int rentalDays) {
        super(brand, pricePerDay, rentalDays);
    }

    // PC3.8: Overriding toString method
    @Override
    public String toString() {
        return "Car - Brand: " + brand + ", Price Per Day: " + pricePerDay + 
        ", Rental Days: " + rentalDays;
    }

    // PC3.8: Overriding equals method
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }
}

// PC3.5: Truck Class
class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String brand, double pricePerDay, int rentalDays, double cargoCapacity) {
        super(brand, pricePerDay, rentalDays);
        this.cargoCapacity = cargoCapacity;
    }

    // PC3.8: Overriding toString method
    @Override
    public String toString() {
        return "Truck - Brand: " + brand + ", Price Per Day: " + pricePerDay + 
        ", Cargo Capacity: " + cargoCapacity;
    }

    // PC3.8: Overriding equals method
    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        Truck truck = (Truck) other;
        return Double.compare(truck.cargoCapacity, cargoCapacity) == 0;
    }
}

// PC3.5: Bike Class
class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String brand, double pricePerDay, int rentalDays, int engineCapacity) {
        super(brand, pricePerDay, rentalDays);
        this.engineCapacity = engineCapacity;
    }

    // PC3.8: Overriding toString method
    @Override
    public String toString() {
        return "Bike - Brand: " + brand + ", Price Per Day: " + pricePerDay + 
        ", Engine Capacity: " + engineCapacity;
    }

    // PC3.8: Overriding equals method
    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        Bike bike = (Bike) other;
        return engineCapacity == bike.engineCapacity;
    }
}

// PC3.9: Main Class
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 50.0, 3);
        Truck truck1 = new Truck("Volvo", 100.0, 2, 5.0);
        Bike bike1 = new Bike("Yamaha", 40.0, 1, 150);

        // PC3.6: Demonstrate Polymorphism Sub , Subtask 3 
        System.out.println("\nPolymorphism Test:");
        Vehicle vehicleRef;

        vehicleRef = car1;
        System.out.println("Vehicle (Car) Details: " + vehicleRef.toString());

        vehicleRef = truck1;
        System.out.println("Vehicle (Truck) Details: " + vehicleRef.toString());

        vehicleRef = bike1;
        System.out.println("Vehicle (Bike) Details: " + vehicleRef.toString());
    }
}
