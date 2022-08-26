package Javasession;

public class Dataconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="1000";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
				System.out.println(i+20);
		
	String y="1000A";
	String ydash=y.replace("A", "").trim();
	int j=Integer.parseInt(ydash);
	System.out.println(j+100);
	
	
	//int to string
	
	int ab=90;
	String ba=String.valueOf(ab);
	System.out.println(ba+20);
	
	
	String b="true";
	boolean b1= Boolean.parseBoolean("true");
	if (b1)
		System.out.println("pass");
	else
    System.out.println("fail");
	}

}
