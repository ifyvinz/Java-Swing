package vincent;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Student extends Person implements Serializable  {
	
	private String borrowDate;
	
	private ArrayList<Book> books;
	
	private File file = new File("books.txt");
	
	public Student() {
		super("Vincent", "Igbineweka");
		books = new ArrayList<Book>();
		//books = new ArrayList<Book>();
	}

	public Student(String namee, String id) {
		super(namee, id);
		//this.borrowDate = date;
		books  = new ArrayList<Book>();
	} 
	
	public ArrayList<Book> getBooks() {
	      return books;
	  }
	
	public void setDate(String date) {
		this.borrowDate = date;
	}
	
	public String  getDate() {
		return borrowDate;
	}
	
	public void addBook(Book book) {
		
		books.add(book);
	}
	
	public void removeBook(Book book) {
		if(books.contains(book)) {
			books.remove(book);
			System.out.println("Book removed. ");
		}else {
			System.out.println("Book not found");
		}
		
	}
	
	public boolean hasBook(Book book) {
		if(books.contains(book)) {
			System.out.println(book.getName()+ " " + book.getId() + " " + book.getAuthor());
			return true;
		}else {
		return false;
		}
	}
	
	
	public void ShowBook() {
		for(Book book : books) {
			System.out.println(book.getName()+ " " + book.getId() + " " + book.getAuthor());
		}
		/*Book  bk = new Book();
		bk.tostring();*/
	}
	
	

	@Override
	public void Display() {
		
		//super.toString();
		//System.out.println(getDate());
		System.out.println(super.getName() + " " + super.getNeptun() + " " + getDate() );
		//System.out.println();
		//System.out.printf(super.getNeptun());
		for(Book book: books) {
			System.out.println(book.getName()+ " " + book.getId() + " " + book.getAuthor());
		}
		
		
	}
	
	///Write to file
			public void putToFile() {
				try {
					FileOutputStream f = new FileOutputStream(file);
					ObjectOutputStream out = new ObjectOutputStream(f);
					
					 for(Book b: books) {
						 out.writeObject(b);
						 //Player sp = p;
						 out.writeObject("Name: " + b.getName());
						 out.writeObject("ID: " + b.getId());
						 out.writeObject("ID: " + b.getAuthor());
						 
						 
						 
						}
						 
					 out.close();
					}
					catch(IOException ex) { 
						System.out.println("Bad files");
					}
				   System.out.println("Added to File");
				}
			// Write from File
				public void  putFromFile()  {
					try {
					   FileInputStream f = new FileInputStream(file);
					   ObjectInputStream in = new ObjectInputStream(f);
					   
					   while(true) {
							
							Book sp = (Book)in.readObject();
						    
							 books.add(sp);
							
							in.close();
						 }
						// in.close();
					}catch (EOFException ex) {
						System.out.println("EOF files");
					}catch(IOException ex) {
						ex.printStackTrace();
						//JOptionPane.showMessageDialog(null,"File could not be loaded");
						//System.out.println("Bad files");
					}catch(ClassNotFoundException e) {
						System.out.println("ClassNotFound files");
					}
					
					
				}
	
	
	
	

}
