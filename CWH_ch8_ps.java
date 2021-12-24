package com.company;

class Workers{
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    String phoneName;
    int modelNumber;

    public String getPhoneName(){
        return phoneName;
    }

    public int getModelNumber(){
        return modelNumber;
    }

    public void ringing(){
        System.out.println("Phone is ringing....");
    }

    public void vibrating(){
        System.out.println("Your phone is vibrating....");
    }
}

class Square{
    int side = 4;

    public int area(int side){
        return side*side;
    }

    public int perimeter(int side){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breath;

    public int area(int length, int breath){
        return length * breath;
    }

    public int perimeter(int length, int breath){
        return 2 * (length + breath);
    }
}

class Circle{
    float radius;

    public double area(float radius){
        return (3.14 * radius * radius);
    }

    public double circumference(float radius){
        return (2 * 3.14 * radius);
    }
}

class Tommy{
    public void hitting(){
        System.out.println("Hitting the enemy.....");
    }

    public void running(){
        System.out.println("Run, enemy is near to you....");
    }

    public void firing(){
        System.out.println("Fire! Fire! Fire!");
    }
}

public class CWH_ch8_ps {
    public static void main(String[] args) {
        /*
 Question 1
        Workers emp = new Workers();
        emp.name = "Satyam";
        emp.salary = 50000;
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.setName("Krishna");
        System.out.println(emp.getName());
*/

        /*
 Question 2
        cellPhone phone = new cellPhone();
        phone.phoneName = "Samsung";
        phone.modelNumber = 11;
        System.out.println(phone.getPhoneName());
        System.out.println(phone.getModelNumber());
        phone.ringing();
        phone.vibrating();
*/

        /*
 Question 3
        Square square = new Square();
        System.out.println(square.area(square.side));
        System.out.println(square.perimeter(square.side));
*/

        /*
 Question 4
        Rectangle rectangle = new Rectangle();
        rectangle.length = 4;
        rectangle.breath = 6;
        System.out.println(rectangle.area(rectangle.length, rectangle.breath));
        System.out.println(rectangle.perimeter(rectangle.length, rectangle.breath));
*/

        /*
 Question 5
        Tommy tommy = new Tommy();
        tommy.hitting();
        tommy.running();
        tommy.firing();
*/

        /*
 Question 6
        Circle circle = new Circle();
        circle.radius = 4;
        System.out.println(circle.area(circle.radius));
        System.out.println(circle.circumference(circle.radius));
*/
    }
}
