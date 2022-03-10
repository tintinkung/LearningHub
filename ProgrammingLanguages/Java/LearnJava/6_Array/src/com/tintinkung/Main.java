package com.tintinkung;

public class Main {

    public static void main(String[] args) {
	    // Java Array
        // <data type>[] <name>

    /* Playing with Arrays */
        int[] daysInWeek;
        daysInWeek = new int[7];

        daysInWeek[0] = 123;
        daysInWeek[1] = 222;
        daysInWeek[2] = 456;
        daysInWeek[3] = 345;
        daysInWeek[4] = 678;
        daysInWeek[5] = 789;
        daysInWeek[6] = 567;


        System.out.println("[1] Our days in weeks: " + daysInWeek[0] + ", " + daysInWeek[1] + ", " + daysInWeek[2] + ", ... " + daysInWeek[6]);

        int[] days_in_week = { 123, 234, 435, 657, 567, 876, 901}; // array initializer

        System.out.println("[2] Our days in weeks: " + days_in_week[0] + ", " + days_in_week[1] + ", " + days_in_week[2] + ", ... " + days_in_week[6]);

        double[] floatingNumbers = {14.2, 12.4, 43.5, 56.7, 67.5, 43.7, 59.3};
        double sum = floatingNumbers[0] + floatingNumbers[1] + floatingNumbers[2] + floatingNumbers[3] + floatingNumbers[4] + floatingNumbers[5] + floatingNumbers[6];
        double average = sum / floatingNumbers.length;

        System.out.println("[3] sum of our arrays is " + average);


    }
}
