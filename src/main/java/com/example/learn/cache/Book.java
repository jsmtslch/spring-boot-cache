package com.example.learn.cache;

public class Book {

	String title;
	String isbn;

	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}

}
