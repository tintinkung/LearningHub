package com.tintinkung;

public class Main {

    public static void main(String[] args) {

        /* * * * * * * * * * * *\
         * Relational Operators
        \* * * * * * * * * * * */
        //  == : Equal
        //  != : Not Equal
        //  >  : Greater Than
        //  <  : Less Than
        //  >= : Greater Than or Equal
        //  <= : Less Than or Equal


        String name = "Bob";

        if(name == "Bob") // name is Equal to Bob
        {
            System.out.println("[1] Equal"); // true
        }
        else
        {
            System.out.println("[1] Not Equal");
        }

        if(name != "Cherry") // name does not equal to Cherry
        {
            System.out.println("[2] Equal"); // true
        }
        else
        {
            System.out.println("[2] Not Equal");
        }

        int num_1 = 5;
        int num_2 = 10;


        if(num_1 > num_2) // 5 > 10 ?
        { // yes
            System.out.println("[3] Equal");
        }
        else // no
        {
            System.out.println("[3] Not Equal"); // true
        }
    }
}
