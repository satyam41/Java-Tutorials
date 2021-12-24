package com.company;

import java.util.Locale;

public class CWH_ch3_stringMethod {
    public static void main(String[] args) {
        String name = "Satyam"; // 1st method to create string.
        String a = new String("Satyam"); // 2nd method to create string.
        // System.out.println(a);
        System.out.println(name);
        System.out.println(name.length()); // give the length of the string.
        System.out.println(name.toLowerCase()); // return all string in lower case.
        System.out.println(name.toUpperCase()); // return all string in upper case.
        String newStr = new String("    Krishna     ");
        System.out.println(newStr);
        System.out.println(newStr.trim()); // remove all the unnecessary white spaces.
        System.out.println(name.substring(2)); // return a substring of given index number starting to end of the string.
        System.out.println(name.substring(2,6)); // return a substring from start index to the end index. Start index is included and end is excluded (start, end(n-1)).
        System.out.println(name.replace('a', 'g')); // replace the any character from string.
        System.out.println(name.replace("tyam", "ier")); // replace the whole word from any string.
        System.out.println(name.startsWith("Sa")); // return the boolean values for give true when string("Satyam") is start with "Sa" it gives True and when this condition is not satisfied then gives False.
        System.out.println(name.endsWith("am")); // return the boolean values for give true when string("Satyam") is end with "am" it gives True and when this condition is not satisfied then gives False.
        System.out.println(name.charAt(2)); // return the charter at index number.
        System.out.println(name.indexOf("S", 4)); // return the index number of given character. Return -1 when the character is not in your string at that index.
        String newString = "Happypppyy";
        System.out.println(newString.lastIndexOf("ppy", 4)); // return the last index number of given character.
        System.out.println(name.equals("Satyams")); // Check the give string and you give in parameter in the function and its return boolean. It is case sensitive.
        System.out.println(name.equalsIgnoreCase("satyam")); // Check the give string and you give in parameter in the function and its return boolean. But it is not a case sensitive.

        /*
         Escape Sequence Character.
         1. \n = new line character.
         2. \t = tab.
         3. \' or \" = single quotes or double quotes.
         4. \\ = backslash
        */

        System.out.println("I am escape sequence \tsingle character");
    }
}
