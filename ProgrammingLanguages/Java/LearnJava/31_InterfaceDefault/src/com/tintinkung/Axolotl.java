package com.tintinkung;

public class Axolotl implements Animal {

    // we no longer have to implement the "talk()" method since it already has a default body
    @Override
    public void move() {
        System.out.println("an axolotl moved!");
    }
}
