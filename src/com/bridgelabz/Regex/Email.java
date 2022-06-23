package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static boolean isEmail(String email) {

        Pattern pattern = Pattern.compile("^[a-z]([a-z0-9+._]){3,16}[a-z0-9]@[a-z0-9][.]{1,12}.[a-z]{2,5}$");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String num = "abc.100@.com.com";

        System.out.println(isEmail(num));
    }
}
