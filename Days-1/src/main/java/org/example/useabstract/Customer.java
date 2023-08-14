package org.example.useabstract;

public class Customer extends Person {


    int numVal = 0;
    public Customer(int numVal) {
        this.numVal = numVal;
    }

    @Override
    public int accountNumber() {
        return numVal;
    }

}
