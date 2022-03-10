package com.tintinkung;

// looks like a class
// but it's like a abstract class
// we define the method as a template
// and "implement" it in other classes
// [Note]: every class implements interface must include all interface method as an Override
public interface Animal {
    // an interface method
    void move();
    void taunt();
}

