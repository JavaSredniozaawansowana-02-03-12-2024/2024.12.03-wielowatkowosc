package com.comarch.szkolenia.wielowatkowosc;

public class LepszyWatek implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Witam !!");
        }
    }
}
