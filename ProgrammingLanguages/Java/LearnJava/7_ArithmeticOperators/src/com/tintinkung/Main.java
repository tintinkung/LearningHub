package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {
    // Arithmetic Operator
        /* * Norminal math operators
         * [+] plus
         * [-] minus
         * [*] multiply
         * [/] divide
         * ...etc.
         */

    // [1] aadditions
        int addition = 12 + 23;
        long result;
        result = addition + 6969;
        System.out.println("[1] " + result);

    // [3] substraction
        int substraction = 12 - 11;
        double substraction_2 = 12.0 - 23.0;
        System.out.println("[2] " + substraction + ", " + substraction_2);

    // [4] multiplication
        int multiplication = 5 * 5;
        double multiplication_2 = 25.0 * 5.0;
        System.out.println("[3] " + multiplication + ", " + multiplication_2);

    // [5] division
        int division = 25 / 5;
        double division_2 = 25.0 / 5.0;
        System.out.println("[4] " + division + ", " + division);

    // [6] modular
        int modular = 25 % 6;
        System.out.println("[5] " + modular);

    // [7] compound addignment operator
        int plane  = 0;

        plane = plane + 1; // add 1 to plane each run
        plane--;           // minus 1 to plane each run
        plane += 5;        // add 5 to plane each run
        System.out.println("[6] " + plane);


    }
}
