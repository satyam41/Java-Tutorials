package com.company;

import java.util.Calendar;

public class CWH_advance_1_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.getWeeksInWeekYear());
    }
}
