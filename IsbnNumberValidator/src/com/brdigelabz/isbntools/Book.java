package com.brdigelabz.isbntools;

public class Book {

	private String isbnNumber;
	private String title;
	private String author;
	public Book(String isbnNumber, String title, String author) {
		super();
		this.isbnNumber = isbnNumber;
		this.title = title;
		this.author = author;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
}
