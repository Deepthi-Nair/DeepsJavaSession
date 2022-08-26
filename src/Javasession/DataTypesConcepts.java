package Javasession;

public class DataTypesConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 byte=8bits
		
		byte b=30;
		byte b1=40;
		System.out.println(b);
		System.out.println(b+b1);
		
		
//short: size=2 bytes=16bits
//range:-32768 to 32767
		short s1=1234;
		System.out.println(s1);
		
//int size=4bytes=32 bits
	//	range:-2147483648 to 214783647
		int i=234;
		
		
		//long size=8bytes=64bits
		long pop=15688966876L;
		System.out.println(pop);
		
		//float: size=4bytes=32bits
		//range:after '.' takes upto 7 digits
		float f1=12.33f;
		float f2= (float)168.67899;
		System.out.println(f1+f2);
		
		
		//double
		//size: 8bytes
		//range: after "." 16 digits
		double d1=12.867574;
		double d2= 89.8978978676657654;
		System.out.println(d1+d2);
		
		//char
		//single digit within ''
		char c1='e';
		char c2= '1';
		char c3= '$';
		System.out.println(c1+c2+c3);
		
		//boolean
		boolean flag1= true;
		boolean flag2= false;
		System.out.println(flag1+ " and "+ flag2);
		
		
		int p1=300,p2=100,p3=3300;
		System.out.println("The total amount is "+(p1+p2+p3));
		
		
	}

}
