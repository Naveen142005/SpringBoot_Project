package com.example.demo.junitfuntions;

public class checkpalindrome {
    public Boolean _checkPalindrome(int number) {
        return String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
