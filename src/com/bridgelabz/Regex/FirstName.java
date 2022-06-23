package com.bridgelabz.Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstName {
    public static boolean isFirstName(String firstName) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3}$");
        if (firstName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();

    }

    public static void main(String[] args) {
        String num = "Abcd";
        System.out.println(isFirstName(num));

    }
}

