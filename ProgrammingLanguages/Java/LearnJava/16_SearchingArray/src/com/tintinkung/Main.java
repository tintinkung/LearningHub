package com.tintinkung;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        /* Searching Array by things to find */

    /* Integer */
        int numberList[] = { 1,3, 5, 7, 8, 9, 4, 7, 13, 234, 3242, 12312 ,21354 , 45, 435};
        System.out.println("[1] Our Array: " + Arrays.toString(numberList));

        int toFind = 12312;
        for(int i = 0; i < numberList.length; i++)
        {
            System.out.println("[1.1] Checking... " + numberList[i]);
            if(numberList[i] == toFind)
            {
                System.out.println("[1.2] ^ It Matches!!!");
                break;
            }
        }

    /* String */
        String stringList[] = { "Bobby", "Kenny", "Joe", "Kim", "Tin", "Kody" };
        System.out.println("[2] Our Array: " + Arrays.toString(stringList));

        String stringToFind = "Tin";
        for(int i = 0; i < stringList.length; i++)
        {
            System.out.println("[2.1] Checking... " + stringList[i]);
            if(stringList[i].equals(stringToFind)/* works more pro */)
            {
                System.out.println("[2.2] ^ It Matches!!!");
                break;
            }
        }
    }
}
