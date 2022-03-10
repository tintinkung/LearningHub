package com.tintinkung; // <-- this is package
// we can import a class from different package in
import world.ocean.Ocean;

public class Main {

    public static void main(String[] args) {

        // we can use another package in out code!
        dev.Main main = new dev.Main();
        // package's public variable can be reference
        System.out.println("[1] " + main.helloWorld);

        Ocean our_ocean = new Ocean();
        System.out.print("[2] Whales in ocean: ");
        our_ocean.whalesInOcean();

        Forest our_forest = new Forest();
        System.out.println("[3] axolotls in forest: " + our_forest.forest_axolotl);
    }
}

class Forest extends Ocean {
    // sub class of protected variable can access the variable directly
    int forest_axolotl = amountOfAxolotl;
}
