package com.example.demo.junitestfuntions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.junitfuntions.checkOddorEven;

@SpringBootTest
class OddorEvenJunit {

	checkOddorEven checker = new checkOddorEven(); 

	@Test
	void oddOrEven_1() {
		assertEquals("odd", checker.getIsoddOrEven(3));
	}
	@Test
	void oddOrEven_2() {
		assertEquals("even", checker.getIsoddOrEven(101));
	}

}
