package com.tintinkung;

public class Main {

    public static void main(String[] args) {

    // Normal classes with normal child
        class Sus {
            String name;
            String color;


            void talk() {
                System.out.println("[1] amogus amogus amogus " + color + " is " +  name);
            }
        }

        Sus sus = new Sus();
        sus.name = "sus";
        sus.color = "red";
        sus.talk();

    // Class with contructor
        class Sheep {
            String name;
            int age;

            /**
             * This is Sheep contructor
             * Will run the function everytime new Sheep() object is created
             */
            Sheep(String name /*[!] default name contructor */) {
                this.name = name; // we can then set this object name as the default contructor parameter.

                System.out.println("[C] Spawning a new sheep...");
                System.out.println("[C] " + baa());
                age = 1; // we can set default age
            }

            String baa() {
                return "baaaaa, sheep " + name + " talked";
            }


            void gainAge() {
                age++;
                System.out.println("[E] Sheep " + name + " evolved to age of " + age);
            }
        }

        Sheep bob = new Sheep("bob" /*[!] this is where you can set it */);
        bob.gainAge();

    //Class with contructor, getter setters
        class Pig {
            String name;
            int age;

            Pig(String name, int age) {
                // set the default value
                setName(name); // with setter
                this.age = age; // without setter
            }
        //[Tip]: in intellij idea, click Code at the top navbar -> Generate to generate new getter setters
            // getter
            public String getName() {
                return name;
            }
            // setter
            public void setName(String name) {
                this.name = name;
            }
        }

        Pig momPig = new Pig("Gary", 69);
        System.out.println("[2] a pig " + momPig.name + " with age " + momPig.age + " spawned");
    }
}
