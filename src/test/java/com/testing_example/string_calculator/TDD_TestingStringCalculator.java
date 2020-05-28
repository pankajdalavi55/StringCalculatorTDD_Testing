package com.testing_example.string_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TDD_TestingStringCalculator {

   
	@Test
	public void return_Zero_if_input_is_EmptyString() {
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void return_Number_if_input_is_SingleNumberString()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1");
		int expected = 1;
		assertEquals(expected, actual); 
	}
	
	@Test
	public void return_Sum_if_2NumberWithCommaDelimiter()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,3");
		int expected = 4;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void return_Sum_if_MoreNumberWithCommaDelimiter()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,2,3,4,5");
		int expected = 15;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void return_Sum_if_NewLineAndCommaDelimiter()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,2\n3");
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void ignore_Number_if_input_contains_numberGreaterThan1000()
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,1000");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	
	
	
}
