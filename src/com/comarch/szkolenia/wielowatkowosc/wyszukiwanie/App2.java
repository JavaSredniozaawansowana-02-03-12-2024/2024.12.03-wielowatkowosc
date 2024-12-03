package com.comarch.szkolenia.wielowatkowosc.wyszukiwanie;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static List<Integer> partialResults = new ArrayList<>();

    public static void main(String[] args) {
        int[] tab = new int[1000000000];

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(new MinFinder(tab, 0, 200000000));
        Thread thread2 = new Thread(new MinFinder(tab, 200000000, 400000000));
        Thread thread3 = new Thread(new MinFinder(tab, 400000000, 600000000));
        Thread thread4 = new Thread(new MinFinder(tab, 600000000, 800000000));
        Thread thread5 = new Thread(new MinFinder(tab, 800000000, 1000000000));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {

        }

        int min = partialResults.get(0);
        for(int i = 1; i < partialResults.size(); i++) {
            if(partialResults.get(i) < min) {
                min = partialResults.get(i);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(min);
        System.out.println(endTime - startTime);
    }
}
