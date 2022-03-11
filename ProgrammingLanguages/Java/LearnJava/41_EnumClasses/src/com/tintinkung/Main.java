package com.tintinkung;


enum Flowers {
    PINK_FLOWER(214),
    ORANGE_FLOWER(75, 58),
    BLUE_FLOWER(169),
    GREEN_FLOWER(69);

    // we can use class's feature in enum block too!
    private int price;

    private final int[] prices = {-1, -1};

    // constructor exist too
    // - the constructor can then be use in enumerator's member
    Flowers(int price) {
        this.price = price;
    }

    //Overriding constructor works too
    Flowers(int price_1, int price_2) {
        prices[0] = price_1;
        prices[1] = price_2;
    }

    int[] getPrice() {
        if(prices[0] == -1) { return new int[]{ price }; }
        else { return prices; }
    }

}

public class Main {

    public static void main(String[] args) {

        Flowers flower_1 = Flowers.PINK_FLOWER;
        Flowers flower_2 = Flowers.ORANGE_FLOWER;

        System.out.println("flower_1 price: " + flower_1.getPrice()[0] + "$");
        System.out.println("flower_2 price: " + flower_2.getPrice()[0] + "$, " + flower_2.getPrice()[1] + "$");

        Flowers flower_3 = Flowers.BLUE_FLOWER;
        Flowers flower_4 = Flowers.GREEN_FLOWER;

        // ordinal is an index of enum points where it is in the enum list
        System.out.println("flower_3 ordinal is: " + flower_3.ordinal());
        System.out.println("flower_4 ordinal is: " + flower_4.ordinal());
        // compareTo() compare the ordinal value to enum's index(int)
        System.out.println("flower_3 is "
            + flower_3.compareTo(Flowers.valueOf(flower_4.name()))
            + " index different from flower_4");
    }
}
