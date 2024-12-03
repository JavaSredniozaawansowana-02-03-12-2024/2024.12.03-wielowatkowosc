package com.comarch.szkolenia.wielowatkowosc.incrementetor;

public class App {
    public static int counter = 0;
    public static int innaZmienna = 0;
    public static final Object lock = new Object();
    public static final Object otherLock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new IncrementatorThread());
        Thread t2 = new Thread(new IncrementatorThread());
        Thread t3 = new Thread(new IncrementatorThread());
        Thread t4 = new Thread(new IncrementatorThread());
        Thread t5 = new Thread(new IncrementatorThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("zepsulo sie !!");
        }

        System.out.println(App.counter);
    }
}
