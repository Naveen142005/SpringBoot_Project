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
		assertEquals("even", checker.getIsoddOrEven(10));
	}
	@Test
	void oddOrEven_3() {
		assertEquals("odd", checker.getIsoddOrEven(13));
	}
	@Test
	void oddOrEven_4() {
		assertEquals("even", checker.getIsoddOrEven(38));
	}
	@Test
	void oddOrEven_5() {
		assertEquals("odd", checker.getIsoddOrEven(39));
	}
	@Test
	void oddOrEven_6() {
		assertEquals("even", checker.getIsoddOrEven(190));
	}
	@Test
	void oddOrEven_7() {
		assertEquals("odd", checker.getIsoddOrEven(131));
	}
	@Test
	void oddOrEven_8() {
		assertEquals("even", checker.getIsoddOrEven(388));
	}
	@Test
	void oddOrEven_9() {
		assertEquals("odd", checker.getIsoddOrEven(1391));
	}
	@Test
	void oddOrEven_10() {
		assertEquals("even", checker.getIsoddOrEven(3810));
	}

}
