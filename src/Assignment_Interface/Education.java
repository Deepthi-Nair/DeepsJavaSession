package Assignment_Interface;

public class Education implements GED   {
	public void rules()
	{
		System.out.println("Education for all");
	}
	@Override
	public void inclusion() {
		// TODO Auto-generated method stub
		
		System.out.println("Include all");
		
	}
	public static void main( String[] args)
	{
	
		Education ed=new Education();
		ed.rules();
		
		IIT ed1=new IIT();
		ed1.arch();
		ed1.civil();
		ed1.rules();
		
		NIT ed2=new NIT();
		ed2.arch();
		ed2.literature();
		
		VIT ed3= new VIT();
		ed3.mech();
		ed3.arch();
		
		ed.inclusion();
				
	
	}

	

}
