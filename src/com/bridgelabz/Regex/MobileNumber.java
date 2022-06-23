package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {


    public static boolean isMobileNumber(String mobileNumber) {

        Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s[7-9][0-9]{9}$");

        if (mobileNumber == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(mobileNumber);

        return matcher.matches();

    }
    public static void main(String[] args) {
        String num = "91 9876543210";
        System.out.println(isMobileNumber(num));
    }
}
