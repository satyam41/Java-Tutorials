package com.company;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_advance_1_java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");
        String myDate2 = dt.format(df);
        System.out.println(myDate2);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df2);
        System.out.println(myDate);
    }
}
