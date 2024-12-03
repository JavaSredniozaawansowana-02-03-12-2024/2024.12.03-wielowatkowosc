package com.comarch.szkolenia.wielowatkowosc.incrementetor;

public class JakisInnyWatek implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (App.otherLock) {
                App.innaZmienna++;
            }
        }
    }
}
