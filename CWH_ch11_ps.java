package com.company;

abstract class Pen{
    abstract void Write();
    abstract void Refill();
}
class FountainPen extends Pen{
    public void Write(){
        System.out.println("Writing...");
    }
    public void Refill(){
        System.out.println("Refilling the pen....");
    }
    public void ChangeNib(){
        System.out.println("Changing Nib...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating the food....");
    }
    public void sleep(){
        System.out.println("Sleeping in the night....");
    }
    public void jump(){
        System.out.println("Jump from here to there.....");
    }
    public void bite(){
        System.out.println("Bite other animals for defence...");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void brain(){
        System.out.println("Humans have to think any thing and do work according them.");
    }
}

abstract class TelePhone{
    abstract public void Ring();
    public void Lift(){
        System.out.println("Lift the phone to connect with other....");
    }
    public void Disconnect(){
        System.out.println("Disconnect the phone to end the conversations..");
    }
}

class SmartTelePhone extends TelePhone{
    @Override
    public void Ring() {
        System.out.println("Phone is ringing....");
    }
}

interface TvRemote{
    void ChangeChannel();
}
interface SmartTvRemote extends TvRemote{
    void ConnectYourPhone();
}
class Tv implements TvRemote{
    public void ChangeChannel(){
        System.out.println("Changing the channel of the TV.");
    }
}

public class CWH_ch11_ps {
    public static void main(String[] args) {
/*
    Question 3 & 5
        Monkey monkey = new Human();
        Human human = new Human();
        monkey.bite();
        monkey.eat();
*/

/*
    Question 4
        TelePhone telePhone = new SmartTelePhone();
        telePhone.Disconnect();
*/
    }
}
