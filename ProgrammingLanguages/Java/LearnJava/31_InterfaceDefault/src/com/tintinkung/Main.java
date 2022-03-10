package com.tintinkung;

public class Main {

    public static void main(String[] args) {

        Axolotl animal = new Axolotl();
        animal.talk(); // returns the default body from Animal interface
        animal.move(); // returns the implemented body in Axolotl class
    }
}
