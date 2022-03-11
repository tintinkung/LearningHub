package com.tintinkung;
import java.io.IOException;

/* Enumerations
 * - in shorts, collection of constant
 */
enum Days {
    // These value is all constant
    // - all caps for community convention
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Main {

    public static void main(String[] args) {

        //        IDENTIFIER.ENUMERATOR >> returns static final, can be access anywhere
        //                 \/
        Days this_day = Days.FRIDAY; //<-- today is friday

//region Example Enums Usage
        int today = -1;
        try {
            // read a day inpur as enum's ordinal value
            System.out.println("What day is today? \n>>\t1: Monday\n>>\t2: Tuesday\n>>\t3: Wednesday\n>>\t4: Thursday\n>>\t5: Friday\n>>\t6: Saturday\n>>\t7: Sunday");
            System.out.print(">> ");

            int temp = -1;
            temp = System.in.read();// some magic to convert char to int
            today = Character.getNumericValue((char) temp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // map an array from Days Enum
        Days[] days_array = Days.values();
        // loop foreach element in array
        for (Days days: days_array)
        {
            /* Compare each day with number to get get today's actual day from enum's ordinal
             * [Note] days.ordinal is 0 - 6, minus 1 from today will fit Days enum
             */
            if(days.ordinal() == (today - 1))
            {
                System.out.println(
                    "Today is "
                    + days.name().toLowerCase()
                    + "."
                );
            }
        }
//endregion


    }
}
