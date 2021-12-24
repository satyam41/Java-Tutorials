package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class CWH_ch9_Access_modifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setId(45);
        emp.setName("Satyam");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
