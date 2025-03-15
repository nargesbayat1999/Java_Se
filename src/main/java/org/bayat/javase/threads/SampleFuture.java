package org.bayat.javase.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleFuture {


    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

        ExecutorService executorService = Executors.newFixedThreadPool(strings.size());
        List<Future<String>> list = new ArrayList<>();
        runThreads(strings.size(), executorService, list);
        gatherResultFromThreads(list);
        shutdowndThreads(executorService);

    }

    private static void runThreads(int size, ExecutorService executorService, List<Future<String>> list) {
        for (int i = 0; i < size; i++) {
            Future<String> future = executorService.submit(new MyCall());
            list.add(future);
        }
    }

    private static void gatherResultFromThreads(List<Future<String>> list) {
        for (Future<String> future : list) {
            try {
                System.out.println(new Date() + "::" + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private static void shutdowndThreads(ExecutorService executorService) {
        executorService.shutdown();
    }

}

