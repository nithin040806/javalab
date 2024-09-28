import java.util.*; 
class Book  
{ 
 	private String bookName, isbnNumber,authorName, publisher; 
 
	 public Book(String bookName,String isbnNumber, String authorName, String publisher)  
 	{  
		this.bookName = bookName;   		
		this.isbnNumber = isbnNumber;   		
		this.authorName = authorName;  
		this.publisher = publisher; 
	 } 
 
 	public void setBookName(String bookName)  
 	{  
	  	this.bookName = bookName; 
 	} 
 
	 public void setIsbnNumber(String isbnNumber)  
 	{  
	  	this.isbnNumber = isbnNumber; 
 	} 
 
 	public void setAuthorName(String authorName)  
 	{  
	  	this.authorName = authorName; 
	 } 
 
 	public void setPublisher(String publisher)  
 	{  
	  	this.publisher = publisher; 
	 } 
 
 	public String getBookName()  
 	{  
		 return bookName; 
 	} 
 
 	public String getIsbnNumber()  
 	{  
	  	return isbnNumber; 
 	} 
 
 	public String getAuthorName()  
	 {  	 
	  	return authorName; 
 	} 
 
 	public String getPublisher()  
	 {  	 
	  	return publisher; 
 	} 
 	public String getBookInfo() {   	
		return String.format("Book Name: %s\nISBN 	Number:%s\nAuthor: 	%s\nPublisher: %s",bookName, isbnNumber,authorName,publisher); 
 	} 
} 
 
public class BookTest { 
 	public static void main(String[] args) {  
	                        Scanner scanner = new Scanner(System.in); 
	                        Book[] books = new Book[30]; 
 
	  	      for (int i = 0; i < books.length; i++) {  
	  	 	System.out.println("Enter details for Book " + (i + 1)+ ":"); 
	  	                  System.out.print("Enter book name: "); 
		                  String bookName = scanner.nextLine(); 
	  	                  System.out.print("Enter ISBN number: "); 
		                  String isbnNumber = scanner.nextLine(); 
                                                      System.out.print("Enter author name: "); 
			String authorName = scanner.nextLine();   	 	
			System.out.print("Enter publisher: "); 
			String publisher = scanner.nextLine(); 
	  	 	books[i] = new Book(bookName, isbnNumber, authorName,publisher); 
	  	 	System.out.println(); 
	  	    } 
 
         		    System.out.println("Book Information:");     			
		  for (int i = 0; i < books.length; i++) { 
			System.out.println("Book " + (i +1) + ":"); 
			System.out.println(books[i].getBookInfo()); 
			System.out.println(); 
	 	 } 
	 	 scanner.close(); 
	  } 
} 
