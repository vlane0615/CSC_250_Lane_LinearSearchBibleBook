package BibleBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;


//Allow user to search through the summary of books for a given keyword
//Store the books in an array list using Generics
//Allow the user to search the summaries and return the first BibleBook found that has a certain keyword in the summary
//Read in from file
//Read in to array list
//Print from array list

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

 		Scanner input = null;
		try {
			input = new Scanner(new File(System.getProperty("user.dir") + "/BibleBook_Data"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);	//kill the program if 
		} 
 		ArrayList<BibleBook> nt_book_info_array = new ArrayList<BibleBook>(); //does this make an array?
 		while(input.hasNext()) 
 		{
 			//nt_book_info_array.add(input.nextLine()); //evaluates to the next line that reads in
 			String book_string = input.nextLine(); //book string
 			String book_title = book_string.substring(0, book_string.indexOf(':'));
 			System.out.println(book_title);
 			
 			int chapter_number = book_string.indexOf(':');
 			
 			String book_chapters = book_string.substring(chapter_number + 1, book_string.indexOf(':', chapter_number + 1));
 			System.out.println(book_chapters);
 			
 			String book_description = book_string.substring(chapter_number + 3, book_string.()-1);
 			System.out.println(book_description);
 		}
 		input.close();
 		
 		static int search(int arr[], int n, int input);  
 		for(int i = 0; i < nt_book_info_array.size(); i++)
 		{
 			if (arr[i] == input)
 				return i;
 		}
 		
 		return -1; 
 		
 		
	}
 		//read input "Jesus", step through each index in array list (linear search), 
		//linear search here indexOf(jesus or -1) otherwise check next
	}
	
	



