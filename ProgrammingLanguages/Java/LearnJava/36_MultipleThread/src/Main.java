// >>>>> Example 1: Norminal Un-Synchronized Thread <<<<<
class MyThread implements Runnable{

    String name;

    Thread t;

    MyThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("[T] Created new Thread (" + this.t + ")");
    }

    @Override
    public void run() {
        System.out.println("[T] The Thread " + this.name + " Has Started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

// >>>>> Example 2: Synchronized Method <<<<<

class Message {
    /* secure everything in java and use in on methods
     * - so if you synchronized a method, you cannot run any other method
     *   until the synchronized method is done
     */
    synchronized void send(String message) {
        System.out.println("Sending Message...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Message sent: \"" + message + "\"");
    }
}
class MessageThreader implements Runnable {
    String message;
    Thread t;
    Message target;

    MessageThreader(String message, Message target) {
        this.message = message;
        this.target = target;

        t = new Thread(this);
        System.out.println("[M] Created new Thread (" + this.t + ")");
    }

    @Override
    public void run() {
        target.send(this.message);
    }
}

public class Main {
    public static void main(String[] args) {

//<editor-fold desc="Example 1: un-synchronized threads">
        // example of creating multiple thread
        MyThread thread_1 = new MyThread("thread_1");
        MyThread thread_2 = new MyThread("thread_2");
        MyThread thread_3 = new MyThread("thread_3");

        System.out.println(thread_1.t.isAlive()); // falsy

        // these thread will star the same time
        thread_1.t.start();
            /* don't start thread_2, until thread_1 is done starting */
            try { thread_1.t.join(); }
            catch (InterruptedException e) { e.printStackTrace(); }
        thread_2.t.start();
            try { thread_2.t.join(); }
            catch (InterruptedException e) { e.printStackTrace(); }
        thread_3.t.start();
//</editor-fold>

//<editor-fold desc="Example 2: Synchronized threads">
        Message message = new Message();

        MessageThreader message_thread_1 = new MessageThreader("Hi, this is my message", message);
        MessageThreader message_thread_2 = new MessageThreader("Omg hi, i received you're message", message);

        /* synchronized running */
        message_thread_1.t.start();
        message_thread_2.t.start();
//</editor-fold>

    }
}
