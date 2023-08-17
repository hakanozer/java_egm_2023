package org.example;

import java.util.concurrent.TimeUnit;

public class Action extends Thread {

    private Customer customer;
    private double min;
    public Action( Customer customer, double min ) {
        this.customer = customer;
        this.min = min;
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
            customer.minus(currentThread().getName(), min);
        }catch (Exception ex){}
    }
}
