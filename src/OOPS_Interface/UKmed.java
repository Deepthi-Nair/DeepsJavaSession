package OOPS_Interface;

public interface UKmed extends WHO {
	public void ent();
	public void pedia();
	public void emergency();
	default void medInsurance()
	{
		System.out.println("UK medical insurance");
	}
	

}
