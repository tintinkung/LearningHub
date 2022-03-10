package com.tintinkung;

public class Human extends Life {

    void talk() { /* "talk" method still overriding the "talk" from super class's abstract */
        System.out.println("Hi, I'm a human");
    }
}
