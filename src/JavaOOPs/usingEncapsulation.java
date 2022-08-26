package JavaOOPs;

public class usingEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		obj.name="MS";
		obj.hq="US";
		obj.setsSharePrice(1000);
		int sh1=obj.getSharePrice();
		
		System.out.println("share price is "+sh1);
		
		

	}

}
