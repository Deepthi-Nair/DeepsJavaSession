package Javasession;

public class User {
String name;
int age;
String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User detail1= new User();
		detail1.name="Deeps";
		detail1.age=20;
		detail1.city="Pune";
		
		
		User detail2= new User();
		detail2.name="Avi";
		detail2.age=29;
		detail2.city="Delhi";
		
		User detail3= new User();
		detail3.name="Tyle";
		detail3.age=35;
		detail3.city="Hyderabad";
		
		
		System.out.println(detail1.name +" "+detail1.age+ " "+detail1.city);
		System.out.println(detail2.name +" "+detail2.age+ " "+detail2.city);
		System.out.println(detail3.name +" "+detail3.age+ " "+detail3.city);
	}

}
