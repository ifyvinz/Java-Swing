package vincent;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BookList {
	
     private ArrayList<Student> bookList;
	 private File file = new File("book.txt");
	 
	 public BookList() {
		 bookList = new ArrayList<Student>();
	 }
	 
	
		
		
		public void add(Student b) {
		        bookList.add(b);
		  }
		
		public ArrayList<Student> getBooks() {
		      return bookList;
		   }
		
		
		// Write from File
		public void  putFromFile()  {
			try {
			   FileInputStream f = new FileInputStream(file);
			   ObjectInputStream in = new ObjectInputStream(f);
			   
			   while(true) {
					
					 Student sp = (Student)in.readObject();
					 bookList.add(sp);
					
					in.close();
				 }
				// in.close();
			}catch (EOFException ex) {
				System.out.println("EOF files");
			}catch(IOException ex) {
				JOptionPane.showMessageDialog(null,"File could not be loaded");
				System.out.println("Bad files");
			}catch(ClassNotFoundException e) {
				System.out.println("ClassNotFound files");
			}
			
			
		}

}
