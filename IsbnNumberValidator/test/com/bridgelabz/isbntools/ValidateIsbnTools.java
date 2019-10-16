package com.bridgelabz.isbntools;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.brdigelabz.isbntools.ValidateIsbn;

class ValidateIsbnTools {

	@Test
	void checkAValid10DigitIsbnNumber() 
	{
		ValidateIsbn validateIsbn =  new ValidateIsbn();
		boolean result = validateIsbn.checkIsbn("0140449116");
		assertTrue("First Value",result);
		result = validateIsbn.checkIsbn("1408855674");
		assertTrue("Second Value",result);
	}
	@Test
	void checkAnInvalid10DigitIsbnNumber() 
	{
		ValidateIsbn validateIsbn =  new ValidateIsbn();
		boolean result = validateIsbn.checkIsbn("1404491191");
		assertFalse(result);
	}
	@Test
	void nineDigitIsbnsAreNotAllowed()
	{
		ValidateIsbn validateIsbn =  new ValidateIsbn();
		Assertions.assertThrows(NumberFormatException.class, ()->validateIsbn.checkIsbn("123456789"));
	}
	@Test
	void nonNumericIsbnAreNotAllowed()
	{
		ValidateIsbn validateIsbn =  new ValidateIsbn();
		Assertions.assertThrows(NumberFormatException.class, ()->validateIsbn.checkIsbn("HellowWorl"));
	
	}
}
