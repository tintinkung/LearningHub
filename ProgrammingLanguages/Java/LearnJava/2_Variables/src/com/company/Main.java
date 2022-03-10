package com.company;

public class Main {

    public static void main(String[] args)
    {
	    // write your code here
        /* Java variables
        *  [type] [identifier] = [data(optional)]
        *
        * notes: we can't have 2 variable of the same name
        */
        // integer variable
        int brainSize = 1000;
        // double variable (stores floating point number)
        double coolnessPoint = 6969.420;
        // string variable stores lists of character
        String name = "Kody";
        // boolean variables only stores true and false
        boolean isCool = true;

        System.out.println(name + ", is he cool?: " + isCool);
        System.out.println(name + " has brain size of " + brainSize);
        System.out.println(name + " has coolness point of " + coolnessPoint);

        /* * Naming Variables
         * [Y]can use letters digit(123) underscores(_) and dollar signs($)
         *
         * [N]do not use java keywords: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
         * [N]cannot starts with a digit(number)
         */
         /* * Naming conventions - comment practice among communities * */
         //1. camelCase
         int camelCaseVariables = 69;
         //2. snake_case
         int this_is_snake_case_variables = 420;
    }
}
