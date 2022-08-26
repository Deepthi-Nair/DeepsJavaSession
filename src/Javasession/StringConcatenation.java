package Javasession;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
	    String s1="100";
	    String x="Hello";
	    String y="Testing";
	    int a=100,b=200;
	    System.out.println(x+y+a+b);
	    //prints HelloTesting100200
	    
	    System.out.println(x+y+(a+b));
	    //prints HelloTesting300
	    
	    System.out.println(a+b+x+y);
	    //prints 300HelloTesting
	    
	    System.out.println(x+y+a+b+a+b);
	    //prints HelloTesting100200100200
	    
	    double a1=12.33;
	    double a2=76.689;
	    System.out.println(x+y+a1+a2);
	    //prints HelloTesting12.3376.689
	    
	    
	    char c1='a';
	    char c2='b';
	    System.out.println(c1+c2);
	    // prints 195 -adds ascii values
	    
	    System.out.println(c1+""+c2);
	    //prints ab
	    
	    int ab=10,ba=3;
	    double cc=ab/ba;
	    System.out.println(cc);
	    
	    System.out.println(10.0/0.0);
	    //prints infinity
	    
	    System.out.println(0.0/0.0);
	    //prints NaN
	    
	    
	    
	}

}
