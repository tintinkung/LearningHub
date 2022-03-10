package com.tintinkung;

public class Main {

    public static void main(String[] args) {
        /*
         * Switch Statement
         */

    /* works with int */
        int Katy = 12;

        switch(Katy)
        {
            case 12: // will returns here
                System.out.println("[1] Katy is 11");
                break; // break out

            case 13:
                System.out.println("[1] Katy is 13");
                break; // break out

            case 14:
                System.out.println("[1] Katy is 14");
                break; // break out

            default:// else
                System.out.println("[1] Unknown Katy age");
                break;
        }

    /* and Strings too */
        String KatyName = "Katie";

        switch(KatyName)
        {
            case "Katy": // will returns here
                System.out.println("[2] Katy");
                break; // break out

            case "Katie":
                System.out.println("[2] Katie!!!");
                break; // break out

            default:// else
                System.out.println("[2] Unknown Katy name");
                break;
        }

    /* Switch Case with no Break */
        int month = 4;
        String season = null; // initialize with null to prevent <value uninitialize error>
        switch(month)
        {
            case 12: // no break, will continue running the search
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;

            default:
                System.out.println("[3] Unkonwn month");
        }

        System.out.println("[3] this season is " + season);
    }
}
