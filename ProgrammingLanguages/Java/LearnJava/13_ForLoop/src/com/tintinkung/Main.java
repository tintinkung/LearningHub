package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {
        /* *
         * For Loop
             ```
             for(initialization; condition; iteration)
             {
                code
             }
             ```
         */

        for(int i = 0; i < 100; i++)
        {
            System.out.println("[1] " + i);
        }


        /* Prime number checker */
        int num;
        boolean isPrime;

        num = 14;

        if(num < 2) isPrime = false;
        else isPrime = true;
        for(int i = 2; i <= num / i; i++)
        {
            if((num % i) == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("[2] The number is Prime");
        else System.out.println("[2] The number is not Prime");
    }
}
