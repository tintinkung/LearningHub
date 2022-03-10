package com.tintinkung;

public class Main
{
    public static void main(String[] args)
    {
    // dataType convertions
	    int jerry = 100;
        byte anotherJerry;
        // converting by casting it at front, will only work in a range of data to convert to
        anotherJerry = (byte)jerry;
        System.out.println("[1]"+anotherJerry);

        //truncation
        double coolDude = 120.5;
        int i;
        i = (int)coolDude; // truncation will happens where it cut off floating point cus dataType is unsupported
        System.out.println("[2]"+i);

        byte fiona = 100;
        byte shrek = 100;
        // will auto cast to int because these byte*byte is ouyt of range of its datatype
        int result = fiona * shrek;
        System.out.println("[3]"+result);

        byte b = 50;
        // cast to byte ourself to prevent it autocast to int
        b = (byte) (b * 2);
        System.out.println("[4]"+b);
    }
}
