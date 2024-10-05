package Java_Library_Management_System;

import java.util.ArrayList;
import java.util.Iterator;

public class Library 
{
	public Book b;
	
	ArrayList<Book> book = new ArrayList<Book>();
	
	//Add Book
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("BOOK ADDED SUCCESSFULLY");
	}
	//Display The Book
	public void showBook()
	{
		if(book.isEmpty())
			System.out.println("NO BOOKS ARE ADDED");
		else
			book.forEach((book)-> System.out.println(book));
	}
	
	//Search Book Based on Id
	public void searchBook(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("NO BOOKS ARE ADDED");
		}
		else
		{
			for (Book b : book) 
			{
				if(b.getBookid()==id)
				{
					System.out.println("BOOK ID MATCHED");
					b.display();
					isFound=true;
				}
			}
		}
		if (isFound==false) 
		{
			System.out.println("INVALID ID");
		}
	}
	
	//Search Book Based on Author
	public void searchBook(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("NO BOOKS ARE ADDED");
		}
		else
		{
			for (Book b : book) 
			{
				if(b.getBookAuthor().equals(author))
				{
					System.out.println("BOOK AUTHOR MATCHED");
					b.display();
					isFound=true;
				}
			}
		}
		if (isFound==false) 
		{
			System.out.println("INVALID AUTHOR NAME");
		}
	}
	
	// Update Book Cost Based On Book Id
	public void updateCost(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("NO BOOKS ARE ADDED");
		}
		else
		{
			for (Book b : book) 
			{
				if(b.getBookid()==id)
				{
					System.out.println("BOOK ID MATCHED");
					b.setBookCost(1000);
					System.out.println(b.getBookCost());
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("INVALID BOOK ID");
		}
	}
	
	//Remove Book Based on Pages
	public void removeBook(int noOfPages)
	{
		Iterator<Book> it = book.iterator();
		boolean isRemoved=false;
		while(it.hasNext())
		{
			Book b = it.next();
			if(b.getNoOfPages()==noOfPages)
			{
				it.remove();
				System.out.println("BOOK REMOVED SUCCESSFULLY");
				isRemoved=true;
			}
		}
		if (isRemoved==false) 
		{
			System.out.println("Invalid no of Pages");
		}
	}
	public void design()
	{
		String s ="\n 📕📕📕***********Welcome to JavaLibrary*************📕📕📕";
		for(int i=0;i<=s.length()-1;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("HANDLED");
			}
			System.out.print(s.charAt(i));
			System.out.print("");
		}
	}
}
