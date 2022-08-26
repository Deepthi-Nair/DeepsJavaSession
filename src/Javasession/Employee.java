package Javasession;

import java.util.ArrayList;

public class Employee {
	public ArrayList<String> canCode(String lang) {
		System.out.println("Employee can code "+lang);
		ArrayList <String> type= new ArrayList<String>();
		switch(lang)
		{
		case "Java":
			type.add("Full stack");
			type.add("microservices");
			break;
		
		case "ML":
			type.add("model building");
			type.add("algorithm development");
			break;
			
		case "React":
			type.add("UI");
			type.add("Full Stack");
			break;	
			
			default:
				System.out.println("Technology not found");
				break;
			
		}
			
		return type;
		
		
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		ArrayList<String> ja=emp.canCode("Java");
		System.out.println("size is "+ja.size());
		System.out.println(ja);
		
		ArrayList<String> ja2=emp.canCode("ML");
		System.out.println("size is "+ja2.size());
		System.out.println(ja2);
		
		emp.canCode("UI");
		
		}

}
