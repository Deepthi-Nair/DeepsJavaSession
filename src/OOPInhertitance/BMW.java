package OOPInhertitance;

public class BMW extends Car{
	
	@Override
	public void start()//over riding the parent method
	{
		System.out.println("BMW auto start");
	}
	public void autoParking()
	{
		System.out.println("BMW auto Parking");
	}

}
