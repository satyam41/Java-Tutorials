package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
}

class MyNewClass{
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class CWH_advance_2_annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        /*
             Annotation in Java:
            1.@overring
            2.@SuppressWarning
            3.@Depricated
            4.@functionalInterface
        */
        MyNewClass newClass = new MyNewClass();

        newClass.sum(4,5);
    }
}
