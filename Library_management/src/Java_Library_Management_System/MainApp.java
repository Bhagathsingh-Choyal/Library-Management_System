package Java_Library_Management_System;

import java.util.Random;
import java.util.Scanner;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Library l = new Library();
		boolean start = true;
		l.design();
		System.out.println();
		while(start)
		{
			System.out.println("Enter the Choice : \n 1.AddBook \n 2. Display Books \n 3.Search Book Based on ID \n 4.Search Book Based on Author \n 5.Update Book Cost \n 6. Remove Book Based on Number of Pages \n 7.Exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
			{
				int bookdid=r.nextInt(1000);
				System.out.println("Enter The Book Title");
				String title =sc.next();
				System.out.println("Enter the Book Cost");
				int cost = sc.nextInt();
				System.out.println("Enter the Book Author");
				String author = sc.next();
				System.out.println("Enter The Number of Pages");
				int noOfPages=sc.nextInt();
				l.addBook(new Book(bookdid, title, cost, author, noOfPages));
			}
			break;
			case 2:
			{
				l.showBook();
			}
			break;
			case 3:
			{
				System.out.println("Enter The Book Id");
				int bookid=sc.nextInt();
				l.searchBook(bookid);
			}
			break;
			case 4:
			{
				System.out.println("Enter The BookAuthor");
				String author=sc.next();
				l.searchBook(author);
			}
			break;
			case 5:
			{
				System.out.println("Enter The Bookid");
				int bookid=sc.nextInt();
				l.updateCost(bookid);
			}
			break;
			case 6:
			{
				System.out.println("Enter the No Of pages");
				int noOfPages=sc.nextInt();
				l.removeBook(noOfPages);
			}
			break;
			case 7:
			{
				start= false;
				System.out.println("Thank You");
			}
			break;
			default:System.out.println("Enter the valid Choice.....");
			}
		}
	}
}
