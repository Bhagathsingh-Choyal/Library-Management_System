package Java_Library_Management_System;

public class Book 
{
	private int bookid;
	private String bookTitle;
	private int bookCost;
	private String bookAuthor;
	private int noOfPages;
	
	public Book() {}

	public Book(int bookid, String bookTitle, int bookCost, String bookAuthor, int noOfPages) 
	{
		this.bookid = bookid;
		this.bookTitle = bookTitle;
		this.bookCost = bookCost;
		this.bookAuthor = bookAuthor;
		this.noOfPages = noOfPages;
	}

	public int getBookid() {
		return bookid;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "\n bookid=" + bookid + "\n bookTitle=" + bookTitle + "\n bookCost=" + bookCost + "\n bookAuthor="
				+ bookAuthor + "\n noOfPages=" + noOfPages + "\n ----------------------------------";
	}
	
	
	
	public void display()
	{
		System.out.println(getBookid());
		System.out.println(getBookTitle());
		System.out.println(getBookCost());
		System.out.println(getBookAuthor());
		System.out.println(getNoOfPages());
	}
}
