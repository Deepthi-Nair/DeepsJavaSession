package OOPInhertitance;

public class TestCar {
	public static void main(String[] args)
	{

	BMW obj=new BMW();
	obj.start();//over ridden
	obj.stop();//inherited
	obj.fuel();
	obj.autoParking();
	obj.engine();
	
	
	Car c= new Car();
	c.start();
	c.engine();
	
	
	Car c1= new BMW();
	c1.start();
//	BMW b1=(BMW)new Car();
//	b1.autoParking();b1.start();
	}
}
