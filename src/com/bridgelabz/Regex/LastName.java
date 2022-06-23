package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static boolean isLastName(String lastName) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3}$");
        if (lastName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();

    }

    public static void main(String[] args) {
        String num = "Abcd";
        System.out.println(isLastName(num));

    }
}
