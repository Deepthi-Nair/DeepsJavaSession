package hashmapConcepts;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       //generic mentioned
		HashMap<String,String> empMap= new HashMap<String, String>();
        
		//insert value
		
		empMap.put("A", "Adam");
		empMap.put("B", "Bea");
		empMap.put("C", "Caty");
		
		System.out.println(empMap.get("A"));
		
	
		HashMap<String,Integer> studentMap= new HashMap<String, Integer>();
	    studentMap.put("Tom", 100);
	    studentMap.put("Peter", 100);
	    studentMap.put("Peter", 200);
	    studentMap.put(null, 400);
	    studentMap.put(null, 500);
	    studentMap.put("elvis", 200);
	    studentMap.put("Max",700);
	    studentMap.put("Dev", null);
	    System.out.println(studentMap.get("Peter"));
	    
	    
	    //traversal method 1 by lambda
	    
	   studentMap.forEach((k,v)->System.out.println(k+" : "+v));
	   
	}

}
