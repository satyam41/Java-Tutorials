package com.company;

import java.util.Scanner;

class Circle_{
    int radius = 10;

    public int area() {
        return (int) (3.14 * radius * radius);
    }
}

class Cylinder_ extends Circle_ {
    public int area(int height){
        return (int) (2 * 3.14 * radius * height + 2 * 3.14 * radius * radius);
    }
}

class Rectangle1{
    int length;
    int breath;
    int height;

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(int length, int breath){
        return length * breath;
    }
    public int volume(int length, int breath, int height){
        return length * breath * height;
    }
}

class Cuboid extends Rectangle1{

    public int area(int length, int breath, int height){
        return 2 * (length * breath + breath * height + height * length);
    }
    public int volume(int length, int breath, int height){
        return length * breath * height;
    }
}

public class CWH_ch10_ps {
    public static void main(String[] args) {
        /*
 Question 1 & 3
        Circle_ circle = new Circle_();
        Cylinder_ cylinder = new Cylinder_();
        System.out.println(cylinder.area(10));
        System.out.println(circle.area());
*/

        // Question 2
        Rectangle1 rectangle = new Rectangle1();
        Cuboid cuboid = new Cuboid();
        System.out.println(rectangle.area(12, 20));
        System.out.println(rectangle.volume(12, 2, 4));
        System.out.println(cuboid.area(2, 2, 2));
        System.out.println(cuboid.volume(2, 2, 2));
    }
}
