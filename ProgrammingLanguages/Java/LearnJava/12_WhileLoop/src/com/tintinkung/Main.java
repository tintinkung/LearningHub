package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {
        /* While Loops */

        // Loops : a way to repeat the code

        // anatomy:
        /*  ```
            while(condition) // while condition is true
            {
                //will do code here
            }
            ```
         */
    /* basic usage */
        int number = 0;
        while ( number < 100 ) // while number is less than 100, do code
        {
            number++; // increase number by 1 each time
            System.out.println("[1] " + number);

        } // if number incremented to 100, ( 100 < 100 ) will be false and escape out of the loop


    /* loop in each element in the array */
        double[] testScore = { 13.5, 12.5, 18.5, 15.9, 11.9 };

        int index = 0; // index of the array
        while (index < testScore.length) // index = 0, lenngth = 5 -> index = 5 < length = 5 (false)
        {
            if(testScore[index] < 16)
            {
                System.out.println("[2.5] bad score");
            }
            else
            {
                System.out.println("[2.5] good score");
            }

            System.out.println("[2] Score : " + testScore[index]);
            index++;
        }


    }
}
