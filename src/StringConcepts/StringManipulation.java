package StringConcepts;

public class StringManipulation {
	public static void main(String[] args)
	{
		String s= "I am so happy again and again";
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('a'));
		System.out.println("second occurence of a is "+s.indexOf('a', s.indexOf('a')+1));
		int i=s.indexOf('a', s.indexOf('a')+1);
		int j=s.indexOf('a', i+1);
		int k=s.indexOf('a', j+1);
		System.out.println(i);
		System.out.println("third occurance "+j);
		//System.out.println("second occurence of a is "+s.indexOf('a',(s.indexOf('a')+1)+(s.indexOf('a')));
		System.out.println("4th occurance "+k);
		for (int l=s.indexOf('a');l<s.length();l++)
		{
			if (s.charAt(l)=='a')
			{
			System.out.println("Next occurence of a is "+l);
		}
			}
		
		System.out.println(" position of ain is "+s.indexOf("ain"));
	
	String msg="Welcome admin";
	if (msg.indexOf("admin")>0)
	{System.out.println("pass");}
	else {System.out.println("Fail");}
	
	System.out.println(msg.toLowerCase());
	System.out.println(msg.trim());
	
	String s4="hello how are you";
	String[] s5=s4.split(" ");
	System.out.println(s5[0]);
	
	
	
	String name= "xXtestingXjavaxXSeleniumXxXpython";
	String[] name1=name.split("xX");
	System.out.println(name1.length);
	System.out.println("First element is "+name1[0]+ "here and length is "+name1[0].length());
	
	String msg1= "your order id is 12345";
	System.out.println(msg1.substring(17));
	
	String str="someone.somewhere.something";
	System.out.println(str.length());
	str=str.replace(".", "/");
	System.out.println(str);
	String[] str1=str.split("/");
	System.out.println("length b4: "+str1.length);
	String str2="";
	
	
	for (int i1=str1.length-1;i1>0;i1--)
	{
		str2=str1[i1]+".";
		System.out.print(str2);
		
		
		//System.out.println(str2);
			
	
	}
	System.out.println(str2.substring(0, 9));
	
	
	

	
	
	
	
	
	}
	
	
	

	

}
