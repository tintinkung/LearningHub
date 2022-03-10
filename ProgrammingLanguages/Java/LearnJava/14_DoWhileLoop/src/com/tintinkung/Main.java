package com.tintinkung;

import java.io.IOException; // Exception signature

public class Main {

    public static void main(String[] args) throws IOException {
	/* DO-WHILE LOOP */

        int bob = 35;

        do  // WILL run atleast once
        {
            System.out.println("[1] bob: " + bob);
            bob++;
        }
        while ( bob < 100 );

    /* choice question with do-while loop */
        char choice;

        do {
            System.out.println("[2] Option one  : Green");
            System.out.println("[2] Option two  : Blue");
            System.out.println("[2] Option three: Red");
            System.out.println("[2] Option fou  : Yellow");
            System.out.println("[2] choose which number you want.");

            choice = (char) System.in.read();

        }while (choice < '1' || choice > '4' );

        switch (choice)
        {
            case '1':
                System.out.println("[3] Wow you chooses green");
                break;
            case '2':
                System.out.println("[3] Wow you chooses blue");
                break;
            case '3':
                System.out.println("[3] Wow you chooses red");
                break;
            case '4':
                System.out.println("[3] Wow you chooses yellow");
                break;
        }
    }
}
