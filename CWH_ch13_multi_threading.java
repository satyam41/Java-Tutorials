package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Thread1 is do coking.");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<=100) {
            System.out.println("Thread2 is doing charting.");
            i++;
        }
    }
}

public class CWH_ch13_multi_threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
