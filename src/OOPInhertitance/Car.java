package OOPInhertitance;

public class Car extends Vehicle{
	@Override
	public void start()
	{
		System.out.println("Car starting");
	}
	public void stop()
	{
		System.out.println("Car stopping");

	}
	public void fuel()
	{
		System.out.println("Car fuelling");
	}
}
