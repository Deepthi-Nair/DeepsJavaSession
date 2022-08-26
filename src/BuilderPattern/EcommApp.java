package BuilderPattern;

public class EcommApp {
public EcommApp login()
{
	System.out.println("default login");
	return this;
	}

public EcommApp login(String un, String pw)
{
	System.out.println(" login with "+un+ " and "+pw);
	return this;
	}

public EcommApp search()
{
	System.out.println("Default search");
	return this;
	}

public EcommApp search(String prodname)
{
	System.out.println(" search by product name "+prodname);
	return this;
	}

public EcommApp search(String prodname,int price)
{
	System.out.println(" search by product name "+prodname+ " and price"+price);
	return this;	
}

public EcommApp addtoCart(String prodname) {
	System.out.println("Added "+prodname+ " to cart");
	return this;
}

public EcommApp doPayment(int upi)
{
	System.out.println("Payment by upi "+upi);
	return this;
	}

public EcommApp doPayment(String cc,int cvv)
{
	System.out.println("Payment by credit card "+cc+ " and "+cvv);
	return this;	
}


public EcommApp doPayment(String cc,int cvv,int otp)
{
	System.out.println("Payment by credit card "+cc+ " and "+cvv+ " and otp "+otp);
	return this;	
}

public EcommApp orderId()
{
	System.out.println("Order id is: "+123);
	return this;
}

public EcommApp logout()
{
	System.out.println("Logged out");
	return this;
	}
}
