package com.comarch.szkolenia.wielowatkowosc.incrementetor;

public class IncrementatorThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //??
            //??
            //??
            //??
            synchronized (App.lock) {
                App.counter++;
            }
        }
    }
}
