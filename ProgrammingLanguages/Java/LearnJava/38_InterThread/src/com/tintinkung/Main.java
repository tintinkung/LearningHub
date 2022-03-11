package com.tintinkung;

///////////////////////////////////////////////////////////////
///        A program to get a variable and get a variable   ///
///   infinitely back and forth                             ///
///////////////////////////////////////////////////////////////

class Q {
    int n;

    // a boolean to set the state of value
    // to limit for a get() then put() call
    boolean wait = false;

    synchronized void get() {
        while (!wait) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Value on of n: " + n );
        notify();
        wait = false;
    }

    synchronized void put(int n) {
        while (wait) {
            try {
                // wait pause the method until notify() is called.
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.n = n;
        System.out.println("Setting the value of n: " + n);
        notify();
        wait = true;
    }


}

// produce an n value from Q class
class Producer implements Runnable{
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer Thread");
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer Thread");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

    }
}
