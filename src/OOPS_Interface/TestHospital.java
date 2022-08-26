package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fortis fh=new Fortis();
		fh.cardio();
		fh.emergency();
		fh.ent();
		fh.onco();
		fh.medInsurance();
		fh.covidTest();
	UNHG.covidNews();
	UNHG.medNews();
		
		
		UKmed uk= new Fortis();
		uk.ent();
		uk.pedia();
		uk.emergency();
		uk.medInsurance();
		
		Medical med=new Fortis();
		med.medInsurance();
	
		
		
		
		Medical.billing();
		

	}

}
