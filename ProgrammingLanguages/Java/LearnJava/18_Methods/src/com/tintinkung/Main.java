package com.tintinkung;

public class Main {

    public static void main(String[] args)
    {

        /* Classes Method!!! */

        class Human
        {
            String name;
            int age;

            /*
            [datatype] name(parameter) {
                //code
            }
            */

            /* create a "talk" Method to be call by class */
            void talk()
            {
                System.out.println("I am " + this.name + " the human, I lived " + this.age + " years");
            }

            String data()
            {
                return "{\n\tname: " + this.name + ",\n\tage: " + this.age + "\n}";
            }
        }

        Human my_human = new Human();

        my_human.name = "Terry";
        my_human.age = 56;

        my_human.talk();     /* calling talk method from the Human class */

        System.out.println(my_human.data());
    }
}
