package com.tintinkung;

public class Main {

    public static void main(String[] args) {
        /* * Data Types
         * integers type - int, short, long, byte
         * floating numbers - float, double
         * char = 'a'
         * boolean - true, false
         */

    //[1] integers type
        // byte - smallest datatype (-128 to 127)
        byte bob = 7;
        // short - (-32,768 to 32767)
        short shortyBoi = 32000;
        // int - commonly used (-2,147,483,648 to 2,147,483,647)
        int thisIsMyInt = 301295734;
        // long - largest integers datatype (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        // can be used to calculate very large number
        int lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;
        System.out.println("[1] In " + days + " days, the light will have traveled " + distance + " miles.");

    //[2] floating numbers
        // float - 32bits (1.4e-045 to 3.4e+038)
        float myBankAccount = 69.69f; // must add an f at the end else java will think its double
        // double - larger than float, more precise - 64bits (4.9e-324 to 1.8e+308)
        double pi = 3.14159265359;

        // Area of circle
        double radius, area;
        radius = 8.7;
        area = pi * radius * radius;
        System.out.println("[2] The area of circle " + radius + " is " + area);

    //[3] characters
        // char - a unicode character (ASCII)
        // see: https://unicode-table.com/en/
        char letter = 'A'; // must be '<char>'
        char thisIsUnicode = '\u0097';
        System.out.println("[3] My characters: " + letter + " " + thisIsUnicode);

    //[4] booleans
        // a datatpes of [true] and [false] used alot in logical coding
        boolean coolness = true;
        System.out.println("[4] My coolness is " + coolness);
    }
}
