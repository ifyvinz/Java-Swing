package vincent;

import java.io.Serializable;

public class Book implements Serializable{
	private String name;
	private String id;
	private String author;
	
	
	public Book(String _name, String _id, String _author) {
		
		this.name = _name;
		this.id = _id;
		this.author = _author;
	}
	
	public Book() {
		this.name = null;
		this.id = null;
		this.author = null;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public void SetId(String _id) {
		this.id = _id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setAuthor(String _author) {
		this.author = _author;
	}
	
	public String getAuthor() {
		return author;
	}
	public String tostring() {
		return name + id + author;
	}
	

}
