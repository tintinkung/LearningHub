package com.tintinkung;

public class Wolf implements Animal, PolarBear.Activity/*accessing nested interface*/ {

    /*
     * To implements an interface, add all of its method as Override
     * These method can then be "implements" in the class
     */

    @Override
    public void move() {
        System.out.println("A Wolf has moved");
    }

    @Override
    public void taunt() {
        System.out.println("A Wold taunted you");
    }

    @Override
    public void hunt() {
        System.out.println("A wolf is hunting you");
    }

    //[Note] any variable inside interface will be final (constant)
}
