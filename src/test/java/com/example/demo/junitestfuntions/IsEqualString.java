package com.example.demo.junitestfuntions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.junitfuntions.checkString;

@SpringBootTest
public class IsEqualString {
   
    checkString ch = new checkString();

    @Test
    void funtion_1(){
        String str_1 = "Hello";
        String str_2 = "Hello";
        assertEquals(true, ch._checkString(str_1,str_2));
    }

    @Test
    void funtion_2(){
        String str_1 = "";
        String str_2 = "";
        assertEquals(false, ch._checkString(str_1,str_2));
    }

}
