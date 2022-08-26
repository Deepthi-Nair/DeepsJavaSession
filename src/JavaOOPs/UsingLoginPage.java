package JavaOOPs;

public class UsingLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.setName("user1");
		lp.setPwd("123");
		lp.login();
		lp.setPwd("456");
		lp.login();
		
		
		LoginPage lp1=new LoginPage();
		lp1.login();
		

	}

}
