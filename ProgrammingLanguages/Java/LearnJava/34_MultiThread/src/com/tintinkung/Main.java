package com.tintinkung;

/* >>>>> Multi Thread -- Multi Tasking <<<<<
 * 1st: Process-based -- Multiple program running at once
 * 2nd: Thread-based  -- Multiple threads inside programs running at once
 *
 * - Multi threading allows you to efficiently run your program
 *   by making use of the processing power your system has.
 */
// >>>> Life of Thread <<<<
// 1. Running/Ready to run.
// 2. Suspended  -- temporary stopped.
// 3. Resumed    -- resumed from suspended.
// 4. Blocked    -- pause and wait for resource to load.
// 5. Terminated -- thread is permanently stopped, done.
//
// >>>> Creating Thread <<<<
// -- Creating by extending Thread or by implementing Runnable
// -- Here's some method that we're gonna play around with
// - getName
// - getPriority
// - isAlive
// - join
// - run
// - sleep
// - start

public class Main {

    public static void main(String[] args) {

        /* create a thread reference */
        // myThread is now our 'main' Thread
        Thread myThread = Thread.currentThread();

        System.out.println(myThread);
        //                name, priority, group name
        //                 \/      \/     \/
        // returns: Thread[main,   5,    main]

        myThread.setName("My Main Method");
        System.out.println(myThread);
        // returns: Thread[My Main Method,5,main]


        try { // fun stuff
            for (int i = 5; i > 0; i--) {
                System.out.println("counting, " + i); /* each count */
                Thread.sleep(1000); /* sleep/pause the thread for 1 second */
            }/* this will log a counting-timer-like thing in console from 5 to 1*/
        }
        catch (InterruptedException e) {
            System.out.println(e); /* NEED to catch an exception that 'might' happens */
        }
    }
}
