package org.example.useabstract;

public abstract class Person {

    public abstract int accountNumber();

    public int total() {
        int num = accountNumber();
        int number = 0;
        if(num == 100) {
            number = 1000000;
        }else if ( num == 200 ) {
            number = 2000000;
        }
        return number;
    }

    public String name() {
        int num = accountNumber();
        String name = "";
        if (num == 100) {
            name = "Ali Bilmem";
        }else if (num == 200) {
            name = "Veli Bilirim";
        }
        return name;
    }

}
