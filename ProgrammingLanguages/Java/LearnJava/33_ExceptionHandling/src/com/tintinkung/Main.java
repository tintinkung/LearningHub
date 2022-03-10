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

    /* How to handle exception? */
    // 1st method: Try and Catch
        /* handle division of zero */
        int c; try { // try run a piece of code
            c = bob / 0;
        }
        catch (ArithmeticException e) { // catch for "ArithmeticException" Exception object
            // IF that exception has thrown
            System.out.println("[ERROR] returning -1: {\n\t" + e + "\n}");

            // to handle the exception, we set c to 0 and no more exception will be thrown
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
            System.out.println("[ERROR]: {\n\t" + e + "\n}\n");
        }


    }
}
