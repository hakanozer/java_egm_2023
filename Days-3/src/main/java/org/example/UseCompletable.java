package org.example;

import java.util.concurrent.CompletableFuture;

public class UseCompletable {

    public static void main(String[] args) {

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() ->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("Thread Call");
                }catch (Exception ex) {}
            }
        });
        completableFuture.join();
        System.out.println("This Line Call");

    }

}
