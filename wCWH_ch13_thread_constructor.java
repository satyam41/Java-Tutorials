package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
        //System.out.println("Hello " + name);
    }
    public void run(){
        int i = 21;
        System.out.println("Hello");
//        while (true){
//            System.out.println("I am thread");
//        }
    }
}
class MyThreadRunAble3 implements Runnable{
    public MyThreadRunAble3(String name){
        super();
    }
    public void run(){
        int i = 0;
            System.out.println("I am a thread 3 not a threat.");
    }
}

public class wCWH_ch13_thread_constructor {
    public static void main(String[] args) {
        MyThr thr = new MyThr("Satyam");
        MyThr thr2 = new MyThr("Aditi");
        MyThreadRunAble3 t = new MyThreadRunAble3("Satyam");
        Thread gun = new Thread(t);
        gun.start();
        System.out.println("The id of the thread is " + gun.getId());
        System.out.println("The name of the thread is " + gun.getName());
//        thr.start();
//        System.out.println("The id of the thread is " + thr.getId());
//        System.out.println("The name of the thread is " + thr.getName());
//        System.out.println("The id of the thread is " + thr2.getId());
//        System.out.println("The name of the thread is " + thr2.getName());
    }
}
