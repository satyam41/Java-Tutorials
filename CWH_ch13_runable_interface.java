package com.company;

class MyThreadRunAble1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<=50) {
            System.out.println("I am a thread 1 not a threat.");
            i++;
        }
    }
}
class MyThreadRunAble2 implements Runnable{
    public void run(){
        int i=0;
        while (i<=50) {
            System.out.println("I am a thread 2 not a threat.");
            i++;
        }
    }
}

public class CWH_ch13_runable_interface {
    public static void main(String[] args) {
        MyThreadRunAble1 bullet1 = new MyThreadRunAble1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunAble2 bullet2 = new MyThreadRunAble2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
