package com.testing_example.string_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class StringCalculator {
	
	static Logger logger = Logger.getLogger(StringCalculator.class);
	
	public static void main(String[] args) throws NegativeNumbersNotAllowedException {
		Scanner scanner = new Scanner(System.in);
		StringCalculator calculate = new StringCalculator();
		String inputstr = "ab";
		while(!inputstr.isEmpty())
		{
			System.out.println("Enter the another Input String");
			try {
				inputstr = scanner.next();
				int sum = calculate.add(inputstr);
				System.out.println("the result is :"+ sum);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

	
	public int add(String input) throws NegativeNumbersNotAllowedException {
		
		if(input.isEmpty() || input == null)
		{
			return 0;
		}
		else {
			List<Integer> allNumbers = numberExtracter(input);
			List<Integer> numbersWithoutIgnored = ignoreNumbers(allNumbers);
			validateNumbers(numbersWithoutIgnored);
			
			int sumOfNumbers = summationOfNumbers(numbersWithoutIgnored);
		
			return sumOfNumbers;
		}
				
		
	}

	private int summationOfNumbers(List<Integer> numbersWithoutIgnored) {
		int sum = 0;
		for(Integer number : numbersWithoutIgnored)
		{
			sum += number;
		}
		return sum;
	}

	private void validateNumbers(List<Integer> numbersWithoutIgnored) throws NegativeNumbersNotAllowedException {
		for (Integer number : numbersWithoutIgnored) {
            validate(number);
        }
	}

	 private void validate(Integer number) throws NegativeNumbersNotAllowedException {
	        if(number < 0)
	        	throw new NegativeNumbersNotAllowedException();
	    }

	private List<Integer> ignoreNumbers(List<Integer> allNumbers) {
		List<Integer> numbersWithoutIgnored = new ArrayList<Integer>();
		for(Integer number :allNumbers)
		{
			if (!isIgnored(number))
                numbersWithoutIgnored.add(number);
		}
		return numbersWithoutIgnored;
	}

	private boolean isIgnored(Integer number) {
		if(number >= 1000)
			return true;
		else
			return false;
	}

	private List<Integer> numberExtracter(String input) {
		List<Integer> allNumbers = new ArrayList();
		
		String[] arrayOfNumbers = input.split("[\\n,]");
		for(String number : arrayOfNumbers)
		{
			allNumbers.add(Integer.parseInt(number));
		}
		return allNumbers;
	}

}
