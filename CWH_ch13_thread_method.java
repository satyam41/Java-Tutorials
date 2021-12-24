package com.company;

class MyThr3 extends Thread{
    public void run(){
        int i = 0;
        // System.out.println("Hello");
        while (i<=50){
            System.out.println("I am thread");
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class CWH_ch13_thread_method {
    public static void main(String[] args) {
        MyThr3 t1 = new MyThr3();
        MyThr1 t2 = new MyThr1("Satyam");
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
