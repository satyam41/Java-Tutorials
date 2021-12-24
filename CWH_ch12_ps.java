package com.company;
import java.util.Scanner;

class Message{
    String a;
    public void DisplayMessage(){
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        System.out.println("Hello " + a);
    }
}


public class CWH_ch12_ps {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.DisplayMessage();
    }
}
