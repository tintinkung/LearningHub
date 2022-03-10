package com.tintinkung;

/**
 * Abstract class, a template for "Life"
 */
public abstract class Life {
    // "Life" being talk-able doesn't make sense.
    // so we use this as a template to Override only.
    // this method won't do anything.

    /* to solve the problem above, we use abstract method to mark as "template" .
     * [Note]: to use abstract method, the parent class has to be named "abstract class" too.
     * */
    abstract void talk();

}
