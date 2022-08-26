package Javasession;

public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
	//eg of infinite loop	
		int i=1;
		/*while(i<=10)
		{
			System.out.println(i);
		}
		*/
		//
		System.out.println("printing i");
		while(i<=10)
		{
			
			System.out.println(i++);
		}
		System.out.println("--------");
		int k=10;
		System.out.println("printing k");
		while( k!=0)
		{
			
			System.out.println(k--);
			
		}
		System.out.println("--------");
		
		//For loop
		System.out.println("printing for loop i");
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
// for(;;)
// {
//	System.out.println("printing inifinite loop");
// }
		System.out.println("--------even");
	for (int e=2;e<=10;e=e+2)
	{
		System.out.println(e);
	}
	System.out.println("--------odd");
	for (int e=1;e<=10;e=e+2)
	{
		System.out.println(e);
	}
	
	System.out.println("--------char");
	for(char c='a';c<='z';c++)
	{
		System.out.println(c);
		}
		
	System.out.println("--------convert ascii to char");
	for(int as=97;as<=122;as++)
	{
		System.out.println((char)as);
		}
	System.out.println("--------even using for");
	
	for(int ev=0;ev<=10;ev++) {
		
		if(ev%2==0) {
			System.out.println(ev);
			
		}
	}
	
	
	//do -while loop
	System.out.println("-----do while loop");
	int r=1;
	do {
		System.out.println(r);
		r++;
	} while (r<=10);
	
	System.out.println("-----character length");
	String str="Hello";
	System.out.println("length of char is  "+str.length());
	for (int len=0;len<=str.length()-1;len++)
	{
		//System.out.println("character  "+str.charAt(len));
		System.out.println("index of character " +str.charAt(len)+"  is"+len);
	}
	
//	  print 00 01 02 03
//	        10 11 12 13
//	        20 21 22 23
//	        30 31 32 33
	
	for (int m=0;m<10;m++)
	{
		for (int n=0;n<10;n++)
		{
			System.out.print(m+""+n+" ");		
		}
		System.out.println();
	}
	
	
	
	}

}
