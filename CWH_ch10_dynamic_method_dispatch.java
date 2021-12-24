package com.company;

class  Phone{
    public void time(){
        System.out.println("Time is 23:00");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
    System.out.println("Playing Music");
    }
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone....");
    }

}

public class CWH_ch10_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone phone = new Phone();
        // phone.greet();
        // phone.name();

        // SmartPhone smartPhone = new SmartPhone();
        // smartPhone.name();
        // smartPhone.welcome();

        Phone phone = new SmartPhone(); // Yes it is allowed
        // SmartPhone smartPhone = new Phone();  // Not allowed
        phone.time();
        phone.on();
        // phone.music(); // Not Allowed

    }
}
