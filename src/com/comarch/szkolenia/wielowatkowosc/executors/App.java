package com.comarch.szkolenia.wielowatkowosc.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek(1));
        singleExecutor.submit(new Watek(2));
        singleExecutor.submit(new Watek(3));
        singleExecutor.submit(new Watek(4));
        singleExecutor.submit(new Watek(5));

        singleExecutor.shutdown();*/

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);

        fixedThreadPool.submit(new Watek(1));
        fixedThreadPool.submit(new Watek(2));
        fixedThreadPool.submit(new Watek(3));
        fixedThreadPool.submit(new Watek(4));
        fixedThreadPool.submit(new Watek(5));
        fixedThreadPool.submit(new Watek(6));
        fixedThreadPool.submit(new Watek(7));
        fixedThreadPool.submit(new Watek(8));

        fixedThreadPool.shutdown();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(1), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(2), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(3), 4, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(4), 20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(5), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(6), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(7), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(8), 4, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(9), 4, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(10), 10, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
