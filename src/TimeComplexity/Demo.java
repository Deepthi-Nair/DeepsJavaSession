package TimeComplexity;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		System.out.println(i);
		
		
		for (int p=0;p<10;p++)
		{
			System.out.println(p);
		}
	
		//single loop -O(n)
		
		
		for (int l=0;l<10;l++)
		{
			for (int m=0;m<10;m++)
			{
			System.out.println(l+""+m);
		}
		}
		
		//double loop O(n2)
	}

}
