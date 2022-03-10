package com.tintinkung;

public class Main {

    public static void main(String[] args) {

        /* *
         * MultiDiemsional Array
         * - Array with dimention
         */

        int fallafel[][] = new int[4][5];
        /*      5 column
        4 rows [] [] [] [] []
               [] [] [] [] []
               [] [] [] [] []
               [] [] [] [] []
         */
        System.out.println("{1} = {");
        for(int i = 0; i < 4; i++)
        {
            System.out.print("\t"); // for 1 row
            for(int k = 0; k < 5; k++)
            {
                fallafel[i][k] = (i + 1) + (100 * (k + 1));
                System.out.print("[" + fallafel[i][k] + "] "); // in 1 5 columns
            }
            System.out.println();
        }
        System.out.println("}");

    /* 3 dimentional */
        int fallefel[][][] = new int[6][4][5];
        System.out.println("{2} = {");
        for(int i = 0; i < 6; i++)
        {
            System.out.print("\t");
            for(int j = 0; j < 4; j++)
            {
                System.out.print("\t");
                for(int k = 0; k < 5; k++)
                {
                    fallefel[i][j][k] = (i + 1) + (100 * (k + 1));
                    System.out.print("[" + fallefel[i][j][k] + "] ");
                }
            }
            System.out.println();
        }
        System.out.println("}");

    }
}
