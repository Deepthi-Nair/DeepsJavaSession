package BuilderPattern;

public class TestEcomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcommApp user= new EcommApp();
		user.login("user1","admin").search("mac").addtoCart("mac").addtoCart("mac").doPayment("mc", 998).orderId().logout();
		user.login()
		            .addtoCart("puma")
		            .doPayment(123)
		            .logout();
		
		
		
		

	}

}
