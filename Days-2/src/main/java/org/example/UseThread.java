package org.example;

public class UseThread {

    public static void main(String[] args) {

        Runnable rn = () -> {
        try {

            Action ac1 = new Action("1.jpg");
            Thread th1 = new Thread(ac1, "1.Thread");
            th1.start();
            th1.join();

            Action ac2 = new Action("2.jpg");
            Thread th2 = new Thread(ac2, "2.Thread");
            th2.start();
            th2.join();

            Action ac3 = new Action("3.jpg");
            Thread th3 = new Thread(ac3, "3.Thread");
            th3.start();
            th3.join();

            System.out.println("All Thread Finish");

        }catch (Exception ex) {}

        };
        new Thread(rn).start();

        System.out.println("This Line Call");
    }

}
