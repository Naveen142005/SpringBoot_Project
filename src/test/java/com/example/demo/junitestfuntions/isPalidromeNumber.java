package com.example.demo.junitestfuntions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.junitfuntions.checkpalindrome;

@SpringBootTest
public class isPalidromeNumber {
    checkpalindrome ch = new checkpalindrome();

    @Test
    void test1(){
        assertEquals(true,ch._checkPalindrome(121));
    }

    @Test
    void test2() {
        assertEquals(true, ch._checkPalindrome(1321));
    }

    //717822P136 - NAVEEN KUMAR M.
    
}
