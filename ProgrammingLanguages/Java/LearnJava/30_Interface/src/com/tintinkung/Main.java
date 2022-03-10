package com.tintinkung;

public class Main {

    public static void main(String[] args) {

        Wolf animal_1 = new Wolf();
        PolarBear animal_2 = new PolarBear();
        Animal animal_3 = new PolarBear();
        System.out.print("[1] "); animal_1.move();
        System.out.print("[2] "); animal_2.move();
        System.out.print("[3] "); animal_1.taunt();
        System.out.print("[4] "); animal_2.taunt();
        System.out.print("[5] "); animal_2.findShelter();
        // animal_3.hunt(); <-- Error: cannot access
        System.out.print("[6] "); animal_3.taunt();

    }
}
