package com.brdigelabz.isbntools;

public class ValidateIsbn {

	private static final int SHORT_ISBN_LENGTH = 10;
	private static final int SHORT_ISBN_MULTIPLIER = 11;

	public boolean checkIsbn(String isbnNumber) {
		int total = 0;
		if(isbnNumber.length()!= SHORT_ISBN_LENGTH) throw new NumberFormatException("Isbn Number must be 10 digits");
		for(int i=0;i<SHORT_ISBN_LENGTH;i++)
		{
			if(!Character.isDigit(isbnNumber.charAt(i))) throw new NumberFormatException("Only Digits are allowed");
			total+=(isbnNumber.charAt(i)-48) * (SHORT_ISBN_LENGTH-i);
		}
		return(total % SHORT_ISBN_MULTIPLIER == 0);
	}

}
