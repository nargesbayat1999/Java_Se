package org.bayat.javase.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();

        strs.add("narges");
        strs.add("narges1");
        strs.add("narges2");
        strs.add("narges3");


        ExecutorService pool = Executors.newFixedThreadPool(strs.size());
        for (int i = 0; i < strs.size(); i++) {
            int index = i;
            pool.execute( () -> {
                        System.out.println(Thread.currentThread().getName() + "  " + strs.get(index));
                    }
            );
        }
    }



}

