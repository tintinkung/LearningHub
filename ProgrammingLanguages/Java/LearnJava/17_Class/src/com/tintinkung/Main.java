package com.tintinkung;

public class Main /* <- this is a class too! */ {

    public static void main(String[] args)
    {
        // Class!

        class Human
        {   /* creating class template */
            String name;
            int age;
            boolean is_male;
        }

        /* Object of the Human class */
        Human a_human = new Human();

        /* we can then give the class object its property by template we created */
        a_human.name = "Larry";
        a_human.age = 13;
        a_human.is_male = true;

        /* and we can use the object of Human class's property we assigned!!! */
        System.out.println("[1] a human: " + a_human.name + " is a " + a_human.age + " grown man.");
    }
}
