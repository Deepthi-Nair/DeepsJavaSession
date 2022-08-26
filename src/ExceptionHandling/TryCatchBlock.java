package ExceptionHandling;

public class TryCatchBlock {
	String name;
	
	
	public static void main(String[] args)
	{
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj= new TryCatchBlock();
		obj.name="Tom";
		obj=null;
	
		try {
			int i=9/0;
			System.out.println(obj.name);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
	}

}
