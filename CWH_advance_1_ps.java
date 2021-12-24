package com.company;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_advance_1_ps {
    public static void main(String[] args) {
        /*
 Question 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many records you want to entered: ");
        int n = sc.nextInt();
        ArrayList<String> student = new ArrayList<>(n);
        int i=0;
        while (i<n){
            System.out.print("Enter the name of the student: ");
            String data = sc.next();
            student.add(data);
            i++;
        }
        for (String element: student){
            System.out.println(element);
        }
*/

        /*
 Question 2
        Date d = new Date();
        long newDate = d.setTime(214702);
        System.out.println(newDate);
        */
        /*
 Question 3
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR) + ":" +cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
*/

        /*
Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println(myDate);
*/

        // Question 5
        HashSet<Integer> set = new HashSet<>();
        set.add(32);
        set.add(12);
        set.add(23);
        set.add(32);
        System.out.println(set);
    }
}
