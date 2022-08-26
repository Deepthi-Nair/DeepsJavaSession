package Assignment_Interface;

public class NIT extends Education implements UKedu,USedu,IndianEdu{
	@Override
	public void literature() {
		// TODO Auto-generated method stub
		
		System.out.println("Impemeting UK literature in NIT");
		
	}

	@Override
	public void arch() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting UK arch in NIT");
	}

	@Override
	public void socialstudies() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US SS in NIT");
		
	}

	@Override
	public void basicScience() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US Basic Science in NIT");
		
	}

	@Override
	public void civil() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian civil in NIT");
		
	}

	@Override
	public void mech() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian mech in NIT");
	}
	public void nitAdmission()
	{
		System.out.println("NIT admissions");
	}
	


}
