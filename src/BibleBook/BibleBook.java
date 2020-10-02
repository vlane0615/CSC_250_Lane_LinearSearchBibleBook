package BibleBook;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


//Given the previously created class called BibleBook that maintains fields for the book name, number of chapters in the book, and short summary of book contents.
//Create a program that generates an array of BibleBooks representing all of the Books in the New Testament of the Bible. 
//You should read the Bible Book data in from a File
//File format should be the following one book per line:
//Book name:number of chapters:summary
//Submit a link to your code on GitHub along with the self evaluation.

public class BibleBook 
{
	private String book_name;
	private int chapters;
	private String description;
	
	public BibleBook(String book_name, int chapters, String description)
	{
		this.book_name = book_name;
		this.chapters = chapters;
		this.description = description;
		
	}
	public void display()
	{
		System.out.println(this.book_name + ", " + this.chapters + " total chapters, " + this.description);
	}
	
	public static void main(String args[]) //driver code; first line to run is 20
	{
		BibleBook book1 = new BibleBook("Philippians", 4, " Paul's letter to Philippi");
		BibleBook book2 = new BibleBook("1 John", 5, "God is light");
		BibleBook book3 = new BibleBook("Hebrews", 13, "Jesus is the great sacrifice");
			
		book1.display();
		book2.display();
		book3.display();
		
		File file = new File("BibleBook_Data"); //begin process to read in Bible info
		
		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name()))
		{
			while (sc.hasNextLine())
			{
				String nt_book_info = sc.nextLine(); //use this scanner to get the next line (sc.nextLine)
				System.out.println(nt_book_info);//print nt_book_info 
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}


