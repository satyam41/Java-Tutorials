package com.company;

class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public int surfaceArea(int radius, int height){
        return (int) (2 * 3.14 * radius * height + 2 * 3.14 * radius * radius);
    }
    public int volume(int radius, int height){
        return (int) (3.14 * radius * radius * height);
    }
    public Cylinder(int radiusCylinder, int heightCylinder){
        radius = radiusCylinder;
        height = heightCylinder;
    }
}

class Rectangles{
    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public int area(int length, int breath) {
        return length * breath;
    }

    public Rectangles(int lengthRectangle, int breathRectangle){
        length = lengthRectangle;
        breath = breathRectangle;
    }
}

class Sphere{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public int surfaceArea(int radius){
        return (int) (4 * 3.14 * radius * radius);
    }
    public int volume(int radius){
        return (int) (1.33 * 3.14 * radius * radius * radius);
    }
    public Sphere(int radiusCylinder){
        radius = radiusCylinder;
    }
}

public class CWH_ch9_ps {
    public static void main(String[] args) {
        /*
 Question 1, 2 & 3
        Cylinder cylinder = new Cylinder(2, 5);
        cylinder.setRadius(5.2f);
        cylinder.setHeight(10.2f);
        int surfaceArea = cylinder.surfaceArea(cylinder.getRadius(), cylinder.getHeight());
        int volume = cylinder.volume(cylinder.getRadius(), cylinder.getHeight());
        System.out.println("Surface area of cylinder is: " + surfaceArea);
        System.out.println("Volume of cylinder is: " + volume);
*/

        /*
 Question 4
        Rectangles rectangles = new Rectangles(4, 5);
        System.out.println(rectangles.area(rectangles.getLength(), rectangles.getBreath()));
*/

        Sphere sphere = new Sphere(2);
        //cylinder.setRadius(5.2f);
        //cylinder.setHeight(10.2f);
        int surfaceArea = sphere.surfaceArea(sphere.getRadius());
        int volume = sphere.volume(sphere.getRadius());
        System.out.println("Surface area of sphere is: " + surfaceArea);
        System.out.println("Volume of sphere is: " + volume);
    }
}
