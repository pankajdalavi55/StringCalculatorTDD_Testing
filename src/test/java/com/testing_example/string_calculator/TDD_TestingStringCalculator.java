package com.testing_example.string_calculator;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TDD_TestingStringCalculator {

   
	@Test
	public void return_Zero_if_input_is_EmptyString() throws NegativeNumbersNotAllowedException {
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void return_Number_if_input_is_SingleNumberString() throws NegativeNumbersNotAllowedException
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1");
		int expected = 1;
		assertEquals(expected, actual); 
	}
	
	@Test
	public void return_Sum_if_2NumberWithCommaDelimiter() throws NegativeNumbersNotAllowedException
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,3");
		int expected = 4;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void return_Sum_if_MoreNumberWithCommaDelimiter() throws NegativeNumbersNotAllowedException
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,2,3,4,5");
		int expected = 15;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void return_Sum_if_NewLineAndCommaDelimiter() throws NegativeNumbersNotAllowedException
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,2\n3");
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void ignore_Number_if_input_contains_numberGreaterThan1000() throws NegativeNumbersNotAllowedException
	{
		StringCalculator calculator = new StringCalculator();
		int actual = calculator.add("1,1000");
		int expected = 1;
		assertEquals(expected, actual);
	}

	 @Rule
	 public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throw_exception_if_input_contains_negative_number() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Negatives not allowed");

        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("2,-5");
    }
	
	
	
	
	
}
