package com.tintinkung;

public class Main {

    public static void main(String[] args) {
        Animal animal_1 = new Animal();
        // tauting from super class will simply taunt its value
        animal_1.taunt(); // print "uwu"

        Tiger animal_2 = new Tiger();
        // tauting from Tiger class will Override the call from Animal class
        animal_2.taunt(); // print "owo qwq umu"


        animal_1.talk();
        animal_2.talk(); // this goes to the super class's because the sub class one is overloaded method
        animal_2.talk("tiger talked"); // an overloaded method
    }
}
