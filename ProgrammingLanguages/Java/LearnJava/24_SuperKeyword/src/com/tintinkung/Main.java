package com.tintinkung;

// Super class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
        this.name = "an animal";
    }

    void display() {
        System.out.println("Animal: " + name /* "super" refer to the super class's */);
    }

    String getName() {
        return this.name;
    }
}

class Species extends Animal {
    String name;

    Species(String name, Animal animal) {
        this.name = name;
        super.name = animal.name;
    }

    void display() {
        super.display(); // using this function from super's
    }

    void displayData() {
        /* "super" refer to the super class's, in this case its the Animal class */
        String superName = super.getName();

        System.out.println("Animal: " + superName + " {\n\t species: " + this.name + "\n}");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal pig = new Animal("Pig");

        Species hog = new Species("Hog", pig); // create a pig animal with hog species
        hog.display();
        hog.displayData();

    }
}
