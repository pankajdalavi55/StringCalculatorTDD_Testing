package com.testing_example.string_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDD_TestingStringCalculator {

   //Add TestCases for kata1 
	// 1. check if inputstring is empty then return 0
	@Test
	public void isInputStringEmpty() {
		StringCalculator helperobj = new StringCalculator();
		int actual = helperobj.isInputStringEmpty("");
		int expected = 0;
		assertEquals(expected, actual);
	}

}
