package com.tintinkung;

public class Tiger extends Animal {

    // same name
    // This one will Override Animal class
    void taunt() {
        System.out.println("owo qwq umu");
    }

    // function Overloaded
    void talk(String message) {
        System.out.println(message);
    }
}
