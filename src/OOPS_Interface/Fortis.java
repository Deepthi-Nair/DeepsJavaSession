package OOPS_Interface;

public class Fortis extends UNHG implements Medical,UKmed,IndiaMed{

	@Override
	public void physio() {
		System.out.println("Fortis--physio");
		
	}

	@Override
	public void cardio() {
		System.out.println("Fortis--cardio");
		
	}

	//UK interface
	@Override
	public void ortho() {
		
		System.out.println("Fortis--ortho");
	}

	@Override
	public void ent() {
		System.out.println("Fortis--ent");
		
	}

	@Override
	public void pedia() {
		System.out.println("Fortis--pedia");
		
	}

	@Override
	public void onco() {
		System.out.println("Fortis--onco");
		
	}

	@Override
	public void dental() {
		System.out.println("Fortis--dental");
		
	}
	
	public void reg()
	{
		System.out.println("Fortis--registration");
	}

	@Override
	public void emergency() {
		// TODO Auto-generated method stub
		System.out.println("Fortis--emergency services");
		
	}
	@Override
	public void medInsurance()
	{
		System.out.println("fh med Insurance");
	}
	
	public void covidTest()
	{
		System.out.println("Fortis Covid Test");
	}

	
}
