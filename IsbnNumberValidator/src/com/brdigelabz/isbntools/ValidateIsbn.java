package com.brdigelabz.isbntools;

public class ValidateIsbn {

	public boolean checkIsbn(String isbnNumber) {
		int total=0;
		boolean result = false;
		if(isbnNumber.length()!= 10) throw new NumberFormatException("Isbn Number must be 10 digits");
		for(int i=0;i<10;i++)
		{
			if(!Character.isDigit(isbnNumber.charAt(i))) throw new NumberFormatException("Only Digits are allowed");
			total+=(isbnNumber.charAt(i)-48) * (10-i);
		}
		if(total%11 == 0)
			result = true;
		
		return result;
	}

}
