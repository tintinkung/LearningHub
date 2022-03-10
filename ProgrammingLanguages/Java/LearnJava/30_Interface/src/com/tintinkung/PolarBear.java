package com.tintinkung;

// we can implement more than 1 interface too
public class PolarBear implements Animal, ArcticAnimal{

    @Override
    public void move() {
        System.out.println("A PolarBear moved");
    }

    @Override
    public void taunt() {
        System.out.println("A PolarBear taunted you");
    }

    @Override
    public void findShelter() {
        System.out.println("A PolarBear is searching for shelter");
    }

    // nested interface
    public interface Activity {
        void hunt();
    }


}
