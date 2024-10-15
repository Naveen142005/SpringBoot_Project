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
        String str_1 = "World";
        String str_2 = "world";
        assertEquals(false, ch._checkString(str_1,str_2));
    }
    @Test
    void function_3() {
        String str_1 = "Java";
        String str_2 = "Java";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

    @Test
    void function_4() {
        String str_1 = "naveen";
        String str_2 = "naven";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

    @Test
    void function_5() {
        String str_1 = "Boomi";
        String str_2 = "Boomi";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

    @Test
    void function_6() {
        String str_1 = "barane";
        String str_2 = "barani";
        assertEquals(false, ch._checkString(str_1, str_2));
    }

    @Test
    void function_7() {
        String str_1 = "sithu";
        String str_2 = "sithu";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

    @Test
    void function_8() {
        String str_1 = "pojit";
        String str_2 = "pojith";
        assertEquals(false, ch._checkString(str_1, str_2));
    }

    @Test
    void function_9() {
        String str_1 = "mengo";
        String str_2 = "mengo";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

    @Test
    void function_10() {
        String str_1 = "sakthi";
        String str_2 = "sakthi";
        assertEquals(true, ch._checkString(str_1, str_2));
    }

}
