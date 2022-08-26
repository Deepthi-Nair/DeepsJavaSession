package Javasession;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(74.98);
		ar.add("string values");
		System.out.println("current size has become "+ar.size());
		//remove value
		System.out.println("remove value");
		ar.remove(3);
		System.out.println("current size has become "+ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}

	}

}
