package org.bayat.javase.threads;

import java.util.Random;
import java.util.concurrent.Callable;

public class  MyCall implements Callable<String> {

    @Override
    public String call() throws Exception {
        //call oracle
        System.out.println("kjrfkjgtf");
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);

        Thread.sleep(randomNumber * 1000);
        return "Name : ".concat(Thread.currentThread().getName());
    }
}
