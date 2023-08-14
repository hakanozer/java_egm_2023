package org.example.inheritance;

public class A extends Base {

    int number = 10;
    @Override
    public void call() {
        int end = print(10,20);
        end += number;
        System.out.println(end);
    }

    public void xCall(int a) {
        if (a == 10) {
            call();
        }else {
            super.call();
        }
    }

    public void pdf() {
        System.out.println("PDf Call");
    }

}
