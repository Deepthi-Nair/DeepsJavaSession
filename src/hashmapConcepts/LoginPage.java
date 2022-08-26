package hashmapConcepts;

import java.util.HashMap;

public class LoginPage {
	//RBAC
	public static String getUserCred(String role)
	{
		HashMap<String, String> credMap= new HashMap<String,String>();
		credMap.put("admin","admin@123.com:admin123");
		credMap.put("customer","admin@cust.com:cust123");
		credMap.put("seller","admin@sell.com:sell123");
		credMap.put("partner1","admin@part1.com:part1123");
		
		return credMap.get(role);
		
	}
	public static void doLogin(String un,String pw)
	{
		System.out.println("Logged in with "+un+" : "+pw);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cred= getUserCred("seller").split(":");
		String un=cred[0].trim();
		String pw=cred[1].trim();
		doLogin(un, pw);

	}

}
