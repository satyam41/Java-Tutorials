package com.company;

class Greet extends Thread {
    Greet() {
        System.out.println("Welcome");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        System.out.println("Good Morning");
    }
}

public class CWH_ch13_ps {
    public static void main(String[] args) {
        Greet greet = new Greet();
        Greet greet1 = new Greet();
        greet.getPriority();
        greet.setPriority(Thread.MAX_PRIORITY);
        greet.start();
        greet1.start();
    }
}
