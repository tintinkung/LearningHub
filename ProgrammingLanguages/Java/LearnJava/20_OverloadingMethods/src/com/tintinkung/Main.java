package com.tintinkung;

public class Main {

    public static void main(String[] args) {
        // Overloadinga methos in java

        class StupidCalculator {

        // bad practice
            int findSum(int a, int b) {
                int sum = a + b;
                return sum;
            }
            // this do the same with findSUm()
            int findSumOfThree(int a, int b, int c) {
                int sum = a + b + c;
                return  sum;
            }

        // with overloading methods
            int sum(int a, int b) {
                int sum = a + b;
                return sum;
            }
            //overload a method with same name
            int sum(int a, int b, int c) {
                int sum = a + b + c;
                return sum;
            }
            // "sum()" method now accept 2 parameter and 3 parameter

        }

        StupidCalculator calc = new StupidCalculator();

        System.out.println("[a]: " + calc.findSum(3, 6));
        System.out.println("[a]: " + calc.findSumOfThree(3, 6, 9));

        // this works now with overloading
        System.out.println("[b]: " + calc.sum(3, 6));
        System.out.println("[b]: " + calc.sum(3, 6, 9));
    }
}
