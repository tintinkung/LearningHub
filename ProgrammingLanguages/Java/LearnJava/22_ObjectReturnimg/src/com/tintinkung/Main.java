package com.tintinkung;


class Number {
    int num;

    Number(int num) {
        this.num = num;
    }

    // a method that return Number object
    Number squared() {
        Number tempObject = new Number(this.num * this.num);
        return  tempObject; // we now return an object!
    }
}

public class Main {

    public static void main(String[] args) {

        Number cheese = new Number(3);
        cheese.squared(); // <- does nothing cus it returns an object
        System.out.println(cheese.num);

        Number doubleCheese = cheese.squared(); // the squared methods can be use as new Number object to pass to
        System.out.println(doubleCheese.num);
    }
}
