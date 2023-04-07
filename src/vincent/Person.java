package vincent;

public abstract class Person {
	private String name;
	private String neptun;
	
	public Person(String namee, String id){
		this.name = namee;
		this.neptun = id;
		
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNeptun(String _neptun) {
		this.neptun = _neptun;
	}
	
	public String getNeptun() {
		return neptun;
	}
	
	
	public String toString() {
		return name + neptun;
	}
	
	abstract public void Display();

}
