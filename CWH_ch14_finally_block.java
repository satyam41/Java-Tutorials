package com.company;

public class CWH_ch14_finally_block {
    public static int function(){
        try {
            int a = 4;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up Resource");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = function();
        System.out.println(k);
        int a = 14;
        int b = 410;
        while (true){
            try {
                int c = a/b;
                System.out.println(c);
                break;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally");
            }
        }
    }
}
