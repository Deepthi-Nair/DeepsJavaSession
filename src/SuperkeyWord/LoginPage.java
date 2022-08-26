package SuperkeyWord;

public class LoginPage  extends Page{
	
	int timeout=200;
	public LoginPage()
	{
		super(10);
		//System.out.println("Default LP contructor");
		
	}
	public void loginInfo()
	{
		System.out.println("Login info method");
		super.display();
		display();
	}
		
	public void timeOut()
	{
		System.out.println(timeout);
		System.out.println(super.timeout);
	}
	@Override
	public void display()
	{
		System.out.println("Login Page Display info");
	}

}
