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
        assertEquals(true, ch._checkPalindrome(12321));
    }

    @Test
    void test3() {
        assertEquals(false, ch._checkPalindrome(123));
    }

    @Test
    void test4() {
        assertEquals(true, ch._checkPalindrome(44444));
    }
    
    @Test
    void test5() {
        assertEquals(false, ch._checkPalindrome(444744));
    }

    @Test
    void test6(){
        assertEquals(true,ch._checkPalindrome(00));
    }

    @Test
    void test7() {
        assertEquals(true, ch._checkPalindrome(67676));
    }

    @Test
    void test8() {
        assertEquals(false, ch._checkPalindrome(875));
    }

    @Test
    void test9() {
        assertEquals(true, ch._checkPalindrome(555666555));
    }
    @Test
    void test10() {
        assertEquals(false, ch._checkPalindrome(57));
    }
}
