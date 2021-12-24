package com.company;

import java.util.Date;

public class CWH_advance_1_date_and_time {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis() + " milli Second");
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}
