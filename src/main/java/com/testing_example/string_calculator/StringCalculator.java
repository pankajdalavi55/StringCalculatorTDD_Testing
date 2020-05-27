package com.testing_example.string_calculator;

public class StringCalculator {

	public int add(String input) {
		String[] number = input.split(",");
		int sum = 0;
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
			for (String numb : number)
			{
				if(string_To_Int_Extracter(numb) >= 1000)
				{
					continue;
				}
				sum += string_To_Int_Extracter(numb);
			}
			return sum;
		}
				
		
	}

	private int string_To_Int_Extracter(String numb) {
	
		return Integer.parseInt(numb);
	}

}
