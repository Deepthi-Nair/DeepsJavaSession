package Assignment_Interface;

public class IIT extends Education implements USedu,UKedu,IndianEdu{

	@Override
	public void literature() {
		// TODO Auto-generated method stub
		
		System.out.println("Impemeting UK literature");
		
		
		
	}

	@Override
	public void arch() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting UK arch");
	}

	@Override
	public void socialstudies() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US SS");
		
	}

	@Override
	public void basicScience() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US Basic Science");
		
	}

	@Override
	public void civil() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian civil");
		
	}

	@Override
	public void mech() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian mech");
	}
	
	public void nitAdmission()
	{
		System.out.println("NIT admissions");
	}

}
