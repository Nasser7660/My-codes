// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 12CAI
// Polymorphism: The ability of an object to take on many forms. 
// In Java, polymorphism allows methods in different classes to have the same name but behave differently,
// depending on the object type.

import java.util.ArrayList;

public class VehicleRentalService {

    // Superclass: Vehicle
    static class Vehicle {
        String brand;
        double pricePerDay;
        int rentalDays;

        public Vehicle(String brand, double pricePerDay, int rentalDays) {
            this.brand = brand;
            this.pricePerDay = pricePerDay;
            this.rentalDays = rentalDays;
        }

        // Method to calculate rental cost
        public double calculateRentalCost() {
            return pricePerDay * rentalDays;
        }

        // Method to display vehicle details
        public void displayDetails() {
            System.out.println("Brand: " + brand + ", Price Per Day: " + pricePerDay + ", Rental Days: " + rentalDays);
        }
    }

    // Subclass: Car
    static class Car extends Vehicle {
        int numDoors;

        public Car(String brand, double pricePerDay, int rentalDays, int numDoors) {
            super(brand, pricePerDay, rentalDays);
            this.numDoors = numDoors;
        }

        // Overriding the displayDetails method to include numDoors
        @Override
        public void displayDetails() {
            System.out.println("Car - Brand: " + brand + ", Price Per Day: " + pricePerDay + ", Rental Days: " + rentalDays + ", Number of Doors: " + numDoors);
        }
    }

    // Subclass: Truck
    static class Truck extends Vehicle {
        double cargoCapacity;

        public Truck(String brand, double pricePerDay, int rentalDays, double cargoCapacity) {
            super(brand, pricePerDay, rentalDays);
            this.cargoCapacity = cargoCapacity;
        }

        // Overriding the displayDetails method to include cargoCapacity
        @Override
        public void displayDetails() {
            System.out.println("Truck - Brand: " + brand + ", Price Per Day: " + pricePerDay + ", Rental Days: " + rentalDays + ", Cargo Capacity: " + cargoCapacity + " tons");
        }
    }

    // Subclass: Bike
    static class Bike extends Vehicle {
        int engineCapacity;

        public Bike(String brand, double pricePerDay, int rentalDays, int engineCapacity) {
            super(brand, pricePerDay, rentalDays);
            this.engineCapacity = engineCapacity;
        }

        // Overriding the displayDetails method to include engineCapacity
        @Override
        public void displayDetails() {
            System.out.println("Bike - Brand: " + brand + ", Price Per Day: " + pricePerDay + ", Rental Days: " + rentalDays + ", Engine Capacity: " + engineCapacity + "cc");
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList to store vehicles
        ArrayList<Vehicle> fleet = new ArrayList<>();

        // Populate the fleet with vehicles
        fleet.add(new Car("Toyota", 50.0, 3, 4));
        fleet.add(new Car("Honda", 60.0, 4, 4));
        fleet.add(new Truck("Volvo", 100.0, 5, 5.0));
        fleet.add(new Truck("Ford", 110.0, 6, 6.0));
        fleet.add(new Bike("Yamaha", 40.0, 2, 150));
        fleet.add(new Bike("Kawasaki", 45.0, 3, 200));

        // Display initial fleet
        System.out.println("Initial Fleet:");
        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails();
        }

        // Remove a vehicle from the fleet (with safety check)
        if (fleet.size() > 3) {
            System.out.println("\nVehicle Removed: " + fleet.get(3).getClass().getSimpleName() + " - Brand: " + fleet.get(3).brand);
            fleet.remove(3);
        } else {
            System.out.println("\nCannot remove vehicle: Fleet size is less than 4.");
        }

        // Display updated fleet
        System.out.println("\nUpdated Fleet:");
        int index = 1;
        for (Vehicle vehicle : fleet) {
            System.out.println("Vehicle " + index + ":");
            vehicle.displayDetails();
            System.out.println();
            index++;
        }
    }
}

