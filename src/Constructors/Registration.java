package Constructors;

public class Registration {

	public Registration(String firstName, String lastName, String email, String ph) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.ph = ph;
		
	}

	private String firstName,lastName,email,ph;

	public String getEmail() {
		return email;
		
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}
	
	
}
