package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {
    // Boolean Logical Operator
        // true and flase
        boolean x = true;
        boolean y = false;
        System.out.println("[1] x: " + x);
        System.out.println("[2] y: " + y + "\n");

        // AND: &
        System.out.println("[3] AND Operator =>\n" +
        "TT: " + (true & true) + ", " +
        "TF: " + (true & false) + ", " +
        "FF: " +  (false &  true) + "\n");

        // OR: |
        System.out.println("[4] OR Operator =>\n" +
        "TT: " + (true | true) + ", " +
        "TF: " + (true | false) + ", " +
        "FF: " +  (false |  true) + "\n");

        // XOR: ^
        System.out.println("[5] XOR Operator =>\n" +
        "TT: " + (true ^ true) + ", " +
        "TF: " + (true ^ false) + ", " +
        "FF: " +  (false ^  true) + "\n");


        // short-circut AND: &&
        // faster than AND, check 1 by 1 if 1 is false, escape out
        System.out.println("[6] Short-circuit AND Operator =>\n" +
        "TT: " + (true && true) + ", " +
        "TF: " + (true && false) + ", " +
        "FF: " +  (false &&  true) + "\n");

        // short-circut AND: ||
        System.out.println("[6] Short-circuit OR Operator =>\n" +
        "TT: " + (true || true) + ", " +
        "TF: " + (true || false) + ", " +
        "FF: " +  (false ||  true) + "\n");

        // NOT: !<data>
        System.out.println("[6] NOT Operator =>\n" +
        "NOT TRUE: " + (!true) + ", " +
        "NOT FALSE: " + (!false) + "\n");
    }
}
