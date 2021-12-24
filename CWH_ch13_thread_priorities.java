package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
        //System.out.println("Hello " + name);
    }
    public void run(){
        int i = 21;

        while (true){
//            System.out.println("I am thread");
            System.out.println("Hello " + this.getName());
        }
    }
}

public class CWH_ch13_thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Satyam1");
        MyThr1 t2 = new MyThr1("Satyam2");
        MyThr1 t3 = new MyThr1("Satyam3");
        MyThr1 t4 = new MyThr1("Satyam4");
        MyThr1 t5 = new MyThr1("Satyam5 (Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
