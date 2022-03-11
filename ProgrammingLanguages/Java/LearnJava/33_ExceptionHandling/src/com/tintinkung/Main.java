package com.tintinkung;

public class Main {

    public static void main(String[] args) {
/* >>>> Exception Handling <<<<
     * detailed source: (https://youtu.be/hyG1LgThrol)
     */
        // Example: divided by 0?
        int bob = 500;
        // int c = bob / 0;                             an exception object
            // returns: {                                      \/
            //      Exception in thread "main" java.lang.ArithmeticException: / by zero
            //	    at com.tintinkung.Main.main(Main.java:17)
            //	}
            // >> this says a new exception has been thrown

/* >>>>> How to handle exception? <<<<< */

//<editor-fold desc="1st: Try and Catch">
System.out.println("\n>>>>> 1st: Try and Catch <<<<<\n");
        /* handle division of zero */
        int c; try { // try run a piece of code
            c = bob / 0;
        }
        catch (ArithmeticException e) { // catch for "ArithmeticException" Exception object
            // IF that exception has thrown
            System.out.println("[ERROR] returning -1: {\n\t" + e + "\n}");

            // to handle the exception, we set c to -1 and no more exception will be thrown
            c = -1;
        }
        System.out.println("c: " + c);

        /* handle array index out of bounds */
        try {
            int coolArray[] = {1};
            coolArray[0] = 10; // fine
            coolArray[2] = 30; // there's no 3 index, will get error
        }
        catch (ArrayIndexOutOfBoundsException e) // find for array out of bound exception
        {
            System.out.println("[ERROR]: {\n\t" + e + "\n}");
        }
//</editor-fold>

//<editor-fold desc="2nd: Throwing Exception">
System.out.println("\n>>>>> 2nd: Throwing Exception <<<<<\n");
        try {/*  Builtin Exceptions: (https://www.tutorialspoint.com/java/java_builtin_exceptions.htm) */
            /* throw a new exception with String description */
            throw new NullPointerException("a null pointer exception thrown");
            // Exception in thread "main" java.lang.NullPointerException: a null pointer exception thrown
            //	 at com.tintinkung.Main.main(Main.java:48)

        } catch (NullPointerException e) {
            System.out.println("[ERROR]: {\n\t" + e + "\n}");
        }

        class Exception {
            static void throwException () {
                try {
                    throw new NullPointerException();
                }
                catch (NullPointerException e) {
                    System.out.println("[ERROR]: {\n\t" + e + "\n}, this exception was caught inside throwException().");
                    throw e; // re throw an exception
                }
            }
        }

        try { Exception.throwException(); }
        catch (NullPointerException e) {
            System.out.println("[ERROR]: {\n\t" + e + "\n}"
                + ", this exception is finally caught inside main().");
        }
//</editor-fold>

//<editor-fold desc="3rd: Throws keyword">
System.out.println("\n>>>>> 3rd: Throws keyword <<<<<\n");
        class Whale {
            /* To use Checked Exceptions
             * - Has to add throws keyword in
             * */
            static void beep() throws ClassNotFoundException{
                System.out.println("beeeep");
                throw new ClassNotFoundException();
            }
        }

        try {
            Whale.beep();
        }
        catch (ClassNotFoundException e ) {
            System.out.println("[ERROR]: {\n\t" + e + "\n}"
                    + ", bypassed whale exception.");
        }
//</editor-fold>

//<editor-fold desc="4th: Finally keyword">
System.out.println("\n>>>>> 4th: Finally keyword <<<<<\n");
        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println("[ERROR]: {\n\t" + e + "\n}"
                + ", passed catch.");
        }
        finally {
            /* this will run, no matter what (finally run) */
            System.out.println("Finally, passed exception handling");
        }
//</editor-fold>


    }
}