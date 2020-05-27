package com.testing_example.string_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDD_TestingStringCalculator {

   //Add TestCases for kata1 
	// 1. check if inputstring is empty then return 0
	@Test
	public void isEmpty_InputStringEmpty_returnZero() {
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkString_InputSingleNumber_returnNumber()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1");
		int expected = 1;
		assertEquals(expected, actual); 
	}
	
	@Test
	public void numberAdditionInString_CommaDelimiter_returnSum()
	{
		
	}

}
