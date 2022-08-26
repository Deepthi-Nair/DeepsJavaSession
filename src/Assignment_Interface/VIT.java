package Assignment_Interface;

public class VIT extends Education implements IndianEdu,UKedu,USedu {
	@Override
	public void literature() {
		// TODO Auto-generated method stub
		
		System.out.println("Impemeting UK literature in VIT");
		
	}

	@Override
	public void arch() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting UK arch in VIT");
	}

	@Override
	public void socialstudies() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US SS in VIT");
		
	}

	@Override
	public void basicScience() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting US Basic Science in VIT");
		
	}

	@Override
	public void civil() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian civil in VIT");
		
	}

	@Override
	public void mech() {
		// TODO Auto-generated method stub
		System.out.println("Impemeting Indian mech in VIT");
	}
	
	public void nitAdmission()
	{
		System.out.println("VIT admissions " );
	}


}
