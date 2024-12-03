package com.comarch.szkolenia.wielowatkowosc.wyszukiwanie;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] tab = new int[1000000000];

        long startTime = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt();
        }

        int min = tab[0];
        for(int i = 1; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(min);
        System.out.println(endTime - startTime);
    }
}
