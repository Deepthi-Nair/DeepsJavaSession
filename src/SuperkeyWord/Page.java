package SuperkeyWord;

public class Page {
	int timeout=100;
	public Page()
	{
		System.out.println("Default page contructor");
	}
	
	public Page(int a,int b)
	{
		System.out.println("Two param page contructor");
	}
	
	public Page(int a)
	{
		System.out.println("One param page contructor");
	}
	
	
	public void display()
	{
		System.out.println("Display info");
	}

}
