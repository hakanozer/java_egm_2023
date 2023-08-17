package org.example;

public class Customer {

    private String name;
    private double total;

    public Customer( String name, double total ) {
        this.name = name;
        this.total = total;
    }

    synchronized
    public void minus( String threadName, double min ) {
        total = total - min;
        System.out.println(threadName + " - " + name + " - total : " + total );
    }

}
