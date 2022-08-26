package ExceptionHandling;

public class Throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		throw new Exception("throwing exception");
		}
		catch (Exception e)
		{
			System.out.println("some exception");
			e.printStackTrace();
			
		}
	}

}
