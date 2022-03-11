package com.tintinkung;

// >>>>> Synchronized Method <<<<<

class Message {
    void send(String message) {
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
        /* Synchronized Thread
         * - make a code block synchronized
         * - will lock all the code to only be run when ... is finished
         */
        synchronized (target) {
            target.send(this.message);
        }

    }
}

public class Main {
    public static void main(String[] args) {

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
