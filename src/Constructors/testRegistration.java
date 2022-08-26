package Constructors;

public class testRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration reg=new Registration("Maria","Philip","Mariaphilip@gmail.com","8755440887");
		System.out.println(reg.getFirstName());
		System.out.println(reg.getLastName());
		System.out.println(reg.getEmail());
		System.out.println(reg.getPh());
        
        reg.setPh("9897665675");
        System.out.println(reg.getPh());
	}

}
