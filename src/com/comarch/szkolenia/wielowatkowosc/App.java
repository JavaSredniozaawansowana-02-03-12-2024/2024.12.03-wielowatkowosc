package com.comarch.szkolenia.wielowatkowosc;

public class App {
    public static void main(String[] args) {
        Watek watek = new Watek();
        watek.start();

        Watek watek2 = new Watek();
        watek2.start();

        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                System.out.println("Witam z wyrazenia lambda !!");
            }
        };

        Thread runnable1 = new Thread(new LepszyWatek());
        Thread runnable2 = new Thread(runnable);

        new Thread(new LepszyWatek()).start();
        new Thread(new LepszyWatek()).start();
        new Thread(new LepszyWatek()).start();
        new Thread(new LepszyWatek()).start();
        new Thread(new LepszyWatek()).start();
        new Thread(new LepszyWatek()).start();

        runnable1.start();
        runnable2.start();

        System.out.println("cos tam !!");
        System.out.println("to jest nasz main !!");
    }
}
