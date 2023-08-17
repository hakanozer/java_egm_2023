package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Erkan Bilsin", 1000);
        Action ac1 = new Action(customer, 100);
        ac1.start();

        Action ac2 = new Action(customer, 300);
        ac2.start();

        Action ac3 = new Action(customer, 500);
        ac3.start();

        // Stream - Paralel
        Result result = new Result();
        List<User> users = result.data(10000);

        // Stream
        long start = System.currentTimeMillis();
        users.parallelStream()
                .filter(
                        item -> item.getRandom().nextInt(100) > 50
                        || item.getName().contains("Name")
                )
                .forEach(item -> {
            try {
                Thread.sleep(1);
                //System.out.println( item.getName() );
            }catch (Exception ex) {}
        });
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println( "between :" + between );

    }
}