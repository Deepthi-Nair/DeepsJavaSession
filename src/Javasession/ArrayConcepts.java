package Javasession;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//integer array
		int i[]= new int[6];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		System.out.println("length of array is "+i.length);
		for(int a=0;a<i.length;a++)
		{
			
			System.out.println("printing at index "+a);
		System.out.println("printing array values  "+i[a]);
		}
		
		System.out.println("-----------char array---------");
		char c[]= new char[7];
		c[0]='d';
		c[1]='f';
		c[2]='i';
		System.out.println("length of array is "+c.length);
		for(int b=0;b<c.length;b++)
		{
			
			System.out.println("printing at index "+b);
		System.out.println("printing array values  "+c[b]);
		}
		System.out.println("-----------enhanced for loop char array---------");
		for(char e:c) 
		{
			System.out.println(e);
		}
	
		//string array
		
		String lang[]=new String[5];
		lang[0]="java";
		lang[1]="python";
		lang[2]="js";
		lang[3]="Ruby";
		System.out.println("printing strings..");
		
		/*Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console */
		
		String name[]= new String[5];
		String dob[]=new String [5];
		String gender[]=new String [5];
		String strike[]= new String[5];
		name[0]="player1";
		name[1]="player2";
		name[2]="player3";
		name[3]="player4";
		name[4]="player5";
		
		dob[0]="10-03-65";
		dob[1]="23-10-76";
		dob[2]="26-08-90";
		dob[3]="07-06-88";
		dob[4]="18-01-91";
		
		gender[0]="male";
	    gender[1]="male";
	    gender[2]="female";
	    gender[3]="female";
	    gender[4]="dont prefer";
	    
	    strike[0]="13.0";
	    strike[1]="7.0";
	    strike[2]="9.0";
	    strike[3]="16.98";
	    strike[4]="18.97";
		
		Object players1[]=new Object [4];
		players1[0]=name[0];
		players1[1]=dob[0];
		players1[2]=gender[0];
		players1[3]=strike[0];
		
		Object players2[]=new Object [4];
		players2[0]=name[1];
		players2[1]=dob[1];
		players2[2]=gender[1];
		players2[3]=strike[1];
		
		Object players3[]=new Object [4];
		players3[0]=name[2];
		players3[1]=dob[2];
		players3[2]=gender[2];
		players3[3]=strike[2];
		
		
		
		Object players4[]=new Object [4];
		players4[0]=name[3];
		players4[1]=dob[3];
		players4[2]=gender[3];
		players4[3]=strike[3];
		
		Object players5[]=new Object [4];
		players5[0]=name[4];
		players5[1]=dob[4];
		players5[2]=gender[4];
		players5[3]=strike[4];
		
		for(Object o:players1) {System.out.print(o+" ");}
		System.out.println();
		for(Object o:players2) {System.out.print(o+" ");}
		System.out.println();
		for(Object o:players3) {System.out.print(o+" ");}
		System.out.println();
		for(Object o:players4) {System.out.print(o+" ");}
		System.out.println();
		for(Object o:players5) {System.out.print(o+" ");}
		System.out.println();
		
		
		
		/*Question 3: Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0 */
		
		
		
		
		for (int l=4;l>=0;l--) {
			//System.out.println("printing l pattern");
			System.out.println("n = "+l);
			
		}
		
		
		
			
		}
		
		
		
		

	}


