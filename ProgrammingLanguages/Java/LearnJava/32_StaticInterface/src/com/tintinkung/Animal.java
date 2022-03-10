package com.tintinkung;

public interface Animal {
    /**
     * Static method
     * - no need an object to call
     */
    static void talk() {
        System.out.println("pfff psss pshh");
    }

    /**
     * Default method
     * - cannot be use like static method
     * - but can be override like norminal un-body method
     */
    default void hunt() {
        System.out.println("an animal is going for hunt");
    }

    /**
     * Private method
     * - also works having body because it has nothing to do outside the interface
     * - only use inside the interface
     */
    private void retreat() {
        System.out.println("an animal is retreating from danger");
    }

    default void danger() {
        System.out.println("an animal accidentally got in danger");
        retreat(); // private method can then be call inside interface method
    }

    void taunt();
}
