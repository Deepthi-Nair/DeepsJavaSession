package OOPS_Interface;

public interface Medical extends WHO {
	
	public void physio();
	public void cardio();
	public void ortho();
	
	public static void billing()
	{
		System.out.println("Static Medical billing");
	}
	default void medInsurance() {
		System.out.println(" Medical Insurance");
	}

}
