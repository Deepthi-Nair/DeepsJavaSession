package JavaOOPs;

public class Encapsulation {
	
	public String name,hq;
	private int sharePrice;
	
	//setter method
	public void setsSharePrice(int sharePrice)
	{
		//sharePrice=setSharePrice;
		this.sharePrice=sharePrice;
	}
	
	
	
	//getter method
	public int getSharePrice()
	{
		return sharePrice;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation cm=new Encapsulation();
		cm.name="IBM";
		cm.sharePrice=1000;
		

	}

}
