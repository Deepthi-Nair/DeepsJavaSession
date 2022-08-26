package Javasession;

public class MethodsAssignment {
	
	public int sum(int a ,int b) {
		int sum=(a+b);
		return sum; 
	}
	
	public double area(int rad) {
		double area= 3.14*rad*rad;
		return area;
	}
	
	public double cirum(int rad) {
		double circum= 3.14*rad*2;
		return circum;
	}
	
	public static int min(int a,int b,int c)
	{
		if ((a<b)&&(a<c))
		{
			return a;
		}
		else if ((b<c)&&(b<a))
		{
			return b;
			
		}
		else 
		{
			return c;
			
		}
	}
	
	public static int max(int a,int b,int c)
	{
		if ((a>b)&&(a>c))
		{
			return a;
		}
		else if ((b>c)&&(b>a))
		{
			return b;
			
		}
		else 
		{
			return c;
			
		}
	}
	
	
	public boolean even(int a) {
		if (a%2==0)
		{   boolean result=true;
			return result;
			}
		else {
			boolean result=false;
			return result;
			}
	}
	
	public int factorial(int a) {
		int fact=1;
		for (int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	
	

	public static void main(String[] args) {
		
		MethodsAssignment calls=new MethodsAssignment();
		int fact=calls.factorial(7);
		System.out.println("Factorial is "+fact);
		

	}

}
