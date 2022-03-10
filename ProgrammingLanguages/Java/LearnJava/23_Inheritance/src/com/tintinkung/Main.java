package com.tintinkung;

// Inheritance
// What is Inheritance?
// - Inheritance is when one or more classes take on the attributes of another class.
// - For example, a class of Dog can take the attributes of the class Animal.
// - This also created a type of hierarchy, giving your code some structure.
//              ↱ >> Class Dog
//   Class Animal
//              ↳ >> Class Cat
/* The anatomy
 * ```java
 *  class Super {
 *     ...
 *     ...
 * }
 *
 * class Sub extends Super {
 *     ...
 *     ...
 * }
 * ```
 */

class Vehicle {
    String name;
    int speed;

    Vehicle(String name, int speed) {
        this.setName(name);
        this.setSpeed(speed);
    }

    Vehicle() { // required this to be able to make Car class inherit this class
        this.name = "N/A";
        this.speed = -1;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    void displayData() {
        System.out.println("Vehicle: {\n\t" + "name: " + name + "\n\tspeed: " + speed + "\n} ");
    }
}

/**
 * Car class Inherited from Vehicle class
 */
class Car extends Vehicle{
    String vehicleType = "Car";
    int numberOfWheels;

    Car(String vehicleType, int numberOfWheels) {
        this.setVehicleType(vehicleType);
        this.setNumberOfWheels(numberOfWheels);
    }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }

    void displayDetailedData() {

        System.out.println("Vehicle: {\n\tname: " + name
            + "\n\tspeed: " + speed // we can now use the name and speed variable because it's inheriting the parent class "Vehicle"
            + "\n\tCar: {\n\t\tvehicleType: " + vehicleType
            + "\n\t\tnumberOfWheels: " + numberOfWheels + "\n\t}\n}");
    }
}

public class Main {

    public static void main(String[] args) {
    // >>>>> Normal vehicle <<<<<
        Vehicle F1 = new Vehicle("formula 1", 650);

        F1.displayData();

    // >>>>> Car vehicle <<<<<
        Car MomCar = new Car("norminal car", 4);
        MomCar.setName("mom's car"); // we can use this since the class is inherited
        MomCar.setSpeed(69); // we can use this

        MomCar.displayDetailedData();
    }
}
