package Javasession;

public class MethodOverLoading {
	
	public void login()
	{
		System.out.println("login..");
	}
	
	public void login(String name, String pw)
	{
		System.out.println("login with "+name+ " and password "+pw);
	}
	
	public void login(String name, int otp)
	{
		System.out.println("login with "+name+ " and password "+otp);
	}
	
	public void login(String name,String pw, int otp)
	{
		System.out.println("login with "+name+" password "+pw+ "password "+otp);
	}
	
	public void login(int ph, String name)
	{
		System.out.println("login with "+name+ " and phone "+ph);
	}
	
	
	public void search()
	{
		
	}

	public void search(String product)
	{
		
	}
	
	public void search(String product, String brand)
	{
		
	}
	
	
	public void search(String product, double price)
	{
		
	}
	
	
	public void doPayment(String cc, String otp)
	{
		
	}
	
	public void doPayment(String debit, String otp,String pwd)
	{
		
	}
	
	public void doPayment(int ph, String otp,String upi)
	{
		
	}
	
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading login= new MethodOverLoading();
		login.login();
		login.search("Tea");
		login.doPayment("1234", "5678");
		

	}

}
