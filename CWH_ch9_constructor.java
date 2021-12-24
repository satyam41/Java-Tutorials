package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    private float salary;

    public MyMainEmployee(){
        id = 12101;
        name = "Aditi";
        salary = 10000;
    }
    public MyMainEmployee(int empId, String myName){
        id = empId;
        name = myName;
        salary = 10000;
    }

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(float s){
        salary = s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }
}

public class CWH_ch9_constructor {
    public static void main(String[] args) {
        // MyMainEmployee myEmp = new MyMainEmployee(12, "Aditi");
        MyMainEmployee myEmp = new MyMainEmployee();
        // myEmp.setId(54);
        // myEmp.setName("Satyam");
        System.out.println(myEmp.getId());
        System.out.println(myEmp.getName());
        System.out.println(myEmp.getSalary());
    }
}
