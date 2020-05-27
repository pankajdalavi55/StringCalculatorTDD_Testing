package com.testing_example.string_calculator;

public class StringCalculator {

	public int add(String input) {
		String[] number = input.split(",");
		
		if(input.isEmpty())
		{
			return 0;
		}
		else if(number.length==1) 
		{
			return Integer.parseInt(input);
		}
		else
		{
			int sum = string_To_Int_Extracter(number[0]) + string_To_Int_Extracter(number[1]);
			return sum;
		}
				
		
	}

	private int string_To_Int_Extracter(String numb) {
	
		return Integer.parseInt(numb);
	}

}
