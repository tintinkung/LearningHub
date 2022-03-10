package com.tintinkung;

/* static variable
 * use with
 * - methods
 * - variable
 * - simple block of code
 * - nested classes
 */

class Potatoes {
    /* static block
     * - if soon as object created within this class, this block of code will run
     */
    static {
        System.out.println("Potatoes is yummy");
    }

    /* static variable
     * - can be access anywhere even outside the class
     */
    static int amount = 30;

    /* static Methods
     * - can be access anywhere even outside the class
     */
    static int getPotatoesAmount() {
        return amount;
    }
}


/* final keyword
 * - basically constant variable
 * - value will NEVER change
 * -* usually named with UPPER_CASE convention
 */

class UniqueID {
    static int totalId = 0;
    final int ID;

    UniqueID() {
        totalId += 1;
        this.ID = totalId;
    }
}


public class Main {

    public static void main(String[] args) {
	    // static variable
        Potatoes potatoes = new Potatoes();

        Potatoes.amount = 20; // Hey, no need object to access this variable anymore
        System.out.println("[1]: " + potatoes.getPotatoesAmount()); // and the variable changed global

        UniqueID my_cow_1 = new UniqueID();
        UniqueID my_cow_2 = new UniqueID();
        UniqueID my_cow_3 = new UniqueID();
        System.out.println("cows ID: " + my_cow_1.ID + " " + my_cow_2.ID + " " + my_cow_3.ID);

        // my_cow.ID = 1; <--// Error: Cannot assign variable to a final

    }
}
