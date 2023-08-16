package org.example;

import java.util.concurrent.TimeUnit;

public class Action implements Runnable {

    String path = "";
    public Action(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                //TimeUnit.SECONDS.sleep(1000);
                System.out.println("Image Upload: " + this.path);
            }catch (Exception ex) {}
        }
        System.out.println( Thread.currentThread().getName() + " Finish" );
    }

}
