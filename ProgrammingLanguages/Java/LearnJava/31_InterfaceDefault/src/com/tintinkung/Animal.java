package com.tintinkung;

public interface Animal {

    /**
     * A Default method foe interface
     * - aka the only way for interface to have a body
     */
    default void talk() {
        System.out.println("mhmm mm mhmm");
    }

    void move();
}
