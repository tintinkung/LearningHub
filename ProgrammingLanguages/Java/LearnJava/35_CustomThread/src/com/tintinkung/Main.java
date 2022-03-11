package com.tintinkung;

/* >>> Creating your Thread <<<< */

// creating thread with runnable
class MyThread implements Runnable {
    Thread t;

    MyThread(String name) {
        t = new Thread(this, name);
        System.out.println("[T] A new child thread has created.");
    }

    @Override
    public void run() {
        /* anything that you want to run */

        try {
            for(int i = 5; i >= 0; i--) {
                if(i == 0) {
                    System.out.println("[T] Thread `" + this.t + "` Started");
                } else {
                    System.out.println("[" + this.t.getName() + "]: " + i);
                }
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e) {
            System.out.println("[" + e + "]");
        }
    }
}

// creating thread by extending from thread class
class YourThread extends Thread {

    YourThread(String name) {
        super(name);
        System.out.println("[T] A new child thread has created.");
    }

    public void run() {
        try {
            for(int i = 5; i >= 0; i--) {
                if(i == 0) {
                    System.out.println("[T] Thread `" + this + "` Started");
                } else {
                    System.out.println("[" + this.getName() + "]: " + i);
                }
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e) {
            System.out.println("[" + e + "]");
        }
    }
}

public class Main {

    public static void main(String[] args)
    {   // create my thread, still won't run the thread's run method
        MyThread my_thread = new MyThread("thread_1");

        // access class's thread then start the thread
        my_thread.t.start();

        // we can run 2 thread at the same time!
        YourThread thread_2 = new YourThread("thread_2");
        thread_2.start();
    }
}
