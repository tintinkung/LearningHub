package com.tintinkung;

public class Main {

    public static void main(String[] args) {

        Human dad = new Human();
        dad.talk();

    // we can declare an object of the abstract "Life".
        Life dog = new Life() {
            // instead, we need to make an override method for the abstract.
            @Override
            void talk() {
                System.out.println("hong hong! bark bark!");
            }
        };

        dog.talk();
    }
}
