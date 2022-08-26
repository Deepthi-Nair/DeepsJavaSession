package Javasession;

public class Customer {
	
	String name;
	int id;
	static String city="Bnaglore";
	static String paymentMethod="cc";
	
	public void getInfo()
	{
		System.out.println("get info....");
	}

	public static void sendMail()
	{
		System.out.println("Send email...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendMail();
		Customer c1= new Customer();
		c1.getInfo();

	}

}
