package vincent;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Person {
	private List<Book> books;
	private List<Student> students;
	
	private File file = new File("students.txt");
	
	
	public Admin() {
		super("Fred Rice", "A23B9P");
		books = new ArrayList<Book>();
		students = new ArrayList<Student>();
	}

	public Admin(String namee, String id) {
		super(namee, id);
		
		books = new ArrayList<Book>();
		students = new ArrayList<Student>();
		
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
	
	

	@Override
	public void Display() {
		
		for(Student st: students) {
			System.out.println(st.getName()+ " " + st.getNeptun() + " " + st.getDate());
		}
		for(Book book : books) {
			System.out.println(book.getName()+ " " + book.getId() + " " + book.getAuthor());
		}
		
	}
	
public void addStudent(Student st) {
		
		students.add(st);
	}
	
	public void removeStudent(Student st) {
		if(students.contains(st)) {
			students.remove(st);
			System.out.println("Student removed. ");
		}else {
			System.out.println("Student not found");
		}
		
	}
	
	public boolean hasStudent(Student st) {
		if(students.contains(st)) {
			System.out.println(st.getName()+ " " + st.getNeptun() + " " + st.getDate());
			return true;
		}else {
		return false;
		}
	}
	
	///Write to file
		public void putToFile() {
			try {
				FileOutputStream f = new FileOutputStream(file);
				ObjectOutputStream out = new ObjectOutputStream(f);
				//out.writeObject(p);
				 for(Student p: students) {
					 out.writeObject(p);
					 //Player sp = p;
					 out.writeObject("Name: " + p.getName());
					 out.writeObject("ID: " + p.getNeptun());
					 
					 
					 
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
						
						 Student sp = (Student)in.readObject();
						 students.add(sp);
						in.close();
					 }
					// in.close();
				}catch (EOFException ex) {
					
				}catch(IOException ex) {
					
				}catch(ClassNotFoundException e) {
					
				}
				
				
			}

}
