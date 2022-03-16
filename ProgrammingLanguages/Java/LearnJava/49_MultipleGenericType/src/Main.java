public class Main {

    public static void main(String[] args) {

        Flower<String, Integer>
            flower_1 = new Flower<String, Integer>("#ffffff", 251);

        System.out.println("Flower color: " + flower_1.getObjectVariableOne());
        System.out.println("It has " + flower_1.getObjectVariableTwo() + " spores");

    }
}

class Flower<Color, Spore> {
    Color objectVariableOne;
    Spore objectVariableTwo;

    public Flower(Color objectVariableOne, Spore objectVariableTwo) {
        this.objectVariableOne = objectVariableOne;
        this.objectVariableTwo = objectVariableTwo;
    }

    public Color getObjectVariableOne() { return objectVariableOne; }
    public void setObjectVariableOne(Color objectVariableOne) { this.objectVariableOne = objectVariableOne; }
    public Spore getObjectVariableTwo() { return objectVariableTwo; }
    public void setObjectVariableTwo(Spore objectVariableTwo) { this.objectVariableTwo = objectVariableTwo; }
}