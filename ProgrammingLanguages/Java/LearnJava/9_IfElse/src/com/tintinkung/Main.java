package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {
	    // If & if-else statements
        /* *
         * if(CONDITION<boolean>) {
         * // do something
         * } else {
         * // do something
         * }
         */

        int age = 80;
        int requiredAge = 16;
        boolean isCool = true;
        // you are cool if you are not gay and age is 16
        if(age >= requiredAge && isCool)
        {
            System.out.println("[1] You're cool dude!");

            // etc. nested statements
            if(age >= 70)
            {
                System.out.println("[2] Jeez you're old");
            }
            else
            {
                System.out.println("[2] You're not old");
            }

        } else
        {
            System.out.println("[1] You're uncool");
        }


    }
}
