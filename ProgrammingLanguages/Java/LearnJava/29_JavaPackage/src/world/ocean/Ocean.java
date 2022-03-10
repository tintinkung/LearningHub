package world.ocean;

public class Ocean {

    private int numberOfWhales = 5;

    public void whalesInOcean() {
        System.out.println(numberOfWhales);
    }

    /*
     * protected keyword
     * - the variable can only be used inside sub class of this class
     * - mostly used in extends keyword
     */
    protected int amountOfAxolotl = 1200;
}
