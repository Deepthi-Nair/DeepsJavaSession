package Javasession;

public class FunctionsInJava {
	
	public void test() {
		System.out.println("calling test method no input no return");
		int i=10;
		System.out.println("printing value of i "+i);
		System.out.println("---------------");
	}
	
	public int getBalance()
	{
		System.out.println("No input but return function called");
		int price=100;
		int paid=30;
		int balance =price-paid;
		System.out.println("---------------");
		return balance;
	}
	
 public int addFunction(int a ,int b)
 {
	 System.out.println("-------------");
	 System.out.println("calling input with return function");
	 return (a+b);
 }
 
 public int getCourse(String course) {
	 
	 System.out.println("----------");
	 System.out.println("get course fee name for "+course);
	 if (course.equals("Selenium"))
	 {
		 return 100;
		 
	 }
	 
	 else if (course.equals("python")) {
		 
		 return 200;
	 }
	 else {
		 System.out.println("course not found" );
		 return -1;
	 }
	 
	 
 }
	

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		System.out.println(obj.getBalance());
		System.out.println("---------------");
		System.out.println(obj.addFunction(30, 50));
		System.out.println(obj.getCourse("u"));
		

	}

}
