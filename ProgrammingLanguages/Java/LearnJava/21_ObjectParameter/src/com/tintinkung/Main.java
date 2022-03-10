package com.tintinkung;

/**
 * A Class object of Tiger
 */
class Tiger {

    String name;
    int age;

    Tiger(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    Tiger() {
        this.setName(null);
        this.setAge(-1);
    }
    // contructor with object
    Tiger(Tiger object) {
        this.setName(object.name);
        this.setAge(object.age);
    }

    // getter setters
    public String getName() { return name == null? "N/A" : name; }
    public void setName(String name) { this.name = name; }
    public int getAge() {  // can now warn if constructor not given value
        System.out.println("[WARN] age not provided");
        return age;
    }
    public void setAge(int age) { this.age = age; }

    //functions
    void taunt() {
        System.out.println("[T] The tiger " + name + " has taunted");
    }
    String data() {
        return ("[T] The tiger data: {\n\tname: " + name + "\n\tage: " + age + "\n}");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println(">>>> Tiger 1 <<<<");
        //with value
        Tiger tiger_1 = new Tiger("Larry", 14);
        tiger_1.taunt();
        System.out.println(tiger_1.data());


        System.out.println(">>>> Tiger 2 <<<<");
        //without value
        Tiger tiger_2 = new Tiger();
        System.out.println("[T-2] name: " + tiger_2.getName() + " age: " + tiger_2.getAge());
        System.out.println(tiger_2.data());


        System.out.println(">>>> Tiger 3 <<<<");
        //with object as parameter
        Tiger tiger_3 = new Tiger(tiger_1); // tiger_3 is now a copy of tiger_1
        tiger_3.taunt();
        System.out.println(tiger_3.data());
    }
}
