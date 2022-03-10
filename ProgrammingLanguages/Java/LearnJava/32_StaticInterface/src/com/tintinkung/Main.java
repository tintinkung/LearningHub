package com.tintinkung;

class Dolphin implements Animal {

    Dolphin() {
        System.out.println(">>>> Spawned a dolphin <<<<");
    }

    @Override
    public void hunt() {
        Animal.super.hunt();
    }

    @Override
    public void taunt() {
        System.out.println("a dolphin just taunted");
    }
}


public class Main {

    public static void main(String[] args) {

        //calling interface's static method
        Animal.talk();

        Dolphin animal = new Dolphin();
        animal.hunt();
        animal.taunt();
        animal.danger();
    }
}
