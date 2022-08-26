package Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage();
		lp.title();
		lp.header();
		lp.doLogin("test", "test123");
		
		HomePage hp=new HomePage();
		hp.header();
		hp.title();
		hp.url();
		hp.logout();
		
		//top casting
		//child class obj referred by parent class reference obj
		Page p=new LoginPage();
		p.header();
		p.title();
		p.header();
		
				
		
			

	}

}
