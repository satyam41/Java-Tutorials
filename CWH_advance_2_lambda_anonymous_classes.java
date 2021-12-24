package com.company;

@FunctionalInterface
interface DemoAnno{
    void meth1(int a);
    // void meth2();
}
//class Satyam implements DemoAnno{
//
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

public class CWH_advance_2_lambda_anonymous_classes {
    public static void main(String[] args) {
        // Anonymous
//        DemoAnno obj = new DemoAnno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }

//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
        // lambda
//    DemoAnno obj = new Satyam();
//    obj.meth1();
        DemoAnno obj = (a)->{ System.out.println("I am method 1 from lambda" + a);};
        obj.meth1(12);
    }
}
