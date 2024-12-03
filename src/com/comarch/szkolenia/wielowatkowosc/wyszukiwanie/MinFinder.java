package com.comarch.szkolenia.wielowatkowosc.wyszukiwanie;

import java.util.Random;

public class MinFinder implements Runnable {
    private int[] tab;
    private int startIndex;
    private int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = startIndex; i < endIndex; i++) {
            tab[i] = random.nextInt();
        }

        int min = tab[startIndex];
        for(int i = startIndex + 1; i < endIndex; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        synchronized (App2.partialResults) {
            App2.partialResults.add(min);
        }
    }
}
