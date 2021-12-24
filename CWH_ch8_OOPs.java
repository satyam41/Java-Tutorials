package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id + " and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_ch8_OOPs {
    public static void main(String[] args) {
        // DRY --> Do not Repeat Yourself.
        System.out.println("Creating out own Java Class.");
        Employee emp = new Employee(); // Instantiating a new Employee object.
        Employee krishna = new Employee(); // Instantiating a new Employee object.
        // Setting Attributes...
        emp.id = 121;
        krishna.id = 122;
        emp.name = "Satyam";
        krishna.name = "Krishna";
        emp.salary = 12000;
        krishna.salary = 120;

        emp.printDetails();
        krishna.printDetails();

        System.out.println(emp.getSalary());
        System.out.println(krishna.getSalary());

        // Printing the Attributes...
        // System.out.println(emp.id);
        // System.out.println(emp.name);
    }
}
