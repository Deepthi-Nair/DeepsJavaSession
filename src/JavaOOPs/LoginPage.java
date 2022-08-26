package JavaOOPs;

public class LoginPage {
	
	private String name, pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void login() {
		System.out.println("Login using "+name+" and password "+pwd);
	}
	

}
