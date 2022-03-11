package com.tintinkung;

class CoolThread implements Runnable {
    Thread t;
    String name;
    private boolean isSuspended;

    synchronized void setSuspended(boolean suspended) {
        if(suspended) {
            /* if suspended, make it suspend */
            isSuspended = true;
            System.out.println("[T] Thread " + name + " has been paused");
        }
        else {
            /* while the thread is suspending, the code below will wait for notify
             * if set to not suspend, set the boolean to false then call notify() to resume the thread.
             */
            isSuspended = false;
            System.out.println("[T] Resumed Thread " + name);
            notify();
        }
    }

    CoolThread(String name) {
        this.name = name;
        t = new Thread(this, name);

        System.out.println("New thread created: " + t);
        isSuspended = false;
    }

    @Override
    public void run() {
        for(int i = 20; i > 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
                /* each countdown, check if the thread is suspended
                 * - if the thread is suspended, wait() for notify
                 */
                synchronized (this) {
                    while (isSuspended) {
                        wait();
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        CoolThread thread_1 = new CoolThread("thread_1");
        thread_1.t.start();

//region Play with thread suspending/pausing
        /* pause the main thread 5 seconds */
            try { Thread.sleep(5000); }
            catch (InterruptedException e) { e.printStackTrace(); }

        thread_1.setSuspended(true);
        /* wait another 10 seconds then resume the thread_1 */
            try { Thread.sleep(10000); }
            catch (InterruptedException e) { e.printStackTrace(); }

        thread_1.setSuspended(false);

//endregion

    }
}
