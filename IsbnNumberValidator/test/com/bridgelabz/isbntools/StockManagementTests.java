package com.bridgelabz.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.brdigelabz.isbntools.Book;
import com.brdigelabz.isbntools.ExternalIsbnDataService;
import com.brdigelabz.isbntools.StockManager;

class StockManagementTests {

	@Test
	void testCanGetACorrectLocatorCode() 
	{
		ExternalIsbnDataService externalIsbnDataService = new ExternalIsbnDataService() {
			
			@Override
			public Book lookup(String isbnNumber) 
			{
					return new Book(isbnNumber, "Sherlock Holmes", "Cannon Doyle");
			}
		};
		
		StockManager stockManager = new StockManager();
		stockManager.setexternalIsbnDataService(externalIsbnDataService);
		
		String isbnNumber = "9351772071";
		String locatorCode = stockManager.getLocatorCode(isbnNumber);
		assertEquals("2071C2", locatorCode);
	}

}
