package OOPS_Interface;

public interface IndiaMed {
	public void onco();
	public void dental();
	public void emergency();
	default void medInsurance()
	{
		System.out.println("India Medical insurance");
	}

}
