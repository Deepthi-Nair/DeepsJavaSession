package Constructors;

public class ConstructorConcepts {

	
	public ConstructorConcepts(String name, int id, int age, double salary, boolean isPerm, char gender) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}
	public ConstructorConcepts(String name, int id, int age) {
	
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public ConstructorConcepts(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	

	
	
	
	String name;
	int id,age;
	double salary;
	boolean isPerm;
	char gender;
	
	
}
