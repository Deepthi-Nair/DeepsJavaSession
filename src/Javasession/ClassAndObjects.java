package Javasession;

public class ClassAndObjects {
    int i=10;  //class variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=30;
		System.out.println("prinitng local variable "+i);
		ClassAndObjects obj = new ClassAndObjects();
		System.out.println("printing class variable "+obj.i);

	}

}
