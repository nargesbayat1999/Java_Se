package org.bayat.javase.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> strings = new ArrayList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

        ExecutorService executorService = Executors.newFixedThreadPool(strings.size());
        for (int i = 0; i < strings.size(); i++) {
            FutureTask<String> futureTask = new FutureTask<>(new MyCall());
//             Thread thread = new Thread(futureTask);
//            thread.start();
            Future<?> future = executorService.submit(futureTask);
            System.out.println(future.get());




        }
        executorService.shutdown();
    }

}
