package Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP default constructor");
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		
		System.out.println("LP title");
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("LP url");		
	}
	
	public void doLogin(String un, String pw)
	{
		System.out.println("Login with username "+un+" and password "+pw);
	}
	public void doLogin(String un, String pw,long ph)
	{
		System.out.println("Login with username "+un+" and password "+pw+" and phone num "+ph);
	}
	

}
