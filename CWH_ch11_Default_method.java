package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording video in 4k....");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Taking snap....");
    }
    public void recordVideo(){
        System.out.println("Recoding video....");
    }
//    public void record4kVideo(){
//        System.out.println("Recording video and snap in 4k....");
//    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] newtworkList = {"M30s", "A20", "M11"};
        return newtworkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class CWH_ch11_Default_method {
    public static void main(String[] args) {
        MySmartPhone mysm = new MySmartPhone();
        mysm.record4kVideo();
        String[] ar = mysm.getNetwork();
        for (String element: ar){
            System.out.println(element);
        }
    }
}
