package com.bridgelabz.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PasswordValidation {
    public static boolean isPassword(String password) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //string num = scanner.next();
        String num = "Poojitha@123";
        System.out.println(isPassword(num));
    }
}
