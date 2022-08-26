package Constructors;

public class Users {
	
	public Users(int userId, String city) {
		super();
		this.userId = userId;
		this.city = city;
	}
	public Users(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Users(String name, int userId, boolean isActive, String city) {
		
		this.name = name;
		this.userId = userId;
		this.isActive = isActive;
		this.city = city;
	}
	
	String name;
	int userId;
	boolean isActive;
	String city;
	
}

