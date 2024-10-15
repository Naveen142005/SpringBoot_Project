package com.example.demo.junitfuntions;

public class checkOddorEven {
    public String getIsoddOrEven (int n) {
		if ((n & 1) == 1) return "odd";
		else return "even";
	}
}
