package com.brdigelabz.isbntools;

public class StockManager 
{
	private ExternalIsbnDataService externalIsbnDataService;
	public void setexternalIsbnDataService(ExternalIsbnDataService externalIsbnDataService)
	{
		this.externalIsbnDataService = externalIsbnDataService;
	}
	public String getLocatorCode(String isbnNumber) 
	{
		Book book = externalIsbnDataService.lookup(isbnNumber);
		StringBuilder locator = new StringBuilder();
		locator.append(isbnNumber.substring(isbnNumber.length()-4));
		locator.append(book.getAuthor().substring(0, 1));
		locator.append(book.getTitle().split(" ").length);
		return locator.toString();
	}
	
}
