package Javasession;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//++ and --
	//post increment- assign and then increment	
		int a=1,b=a++;
		System.out.println(a);// a is incremented to 2
		
		System.out.println(b);// b is first assigned the original value of a which is 1
		//prints 2,1
		
		//pre increment --increment and then assign
		int c=1,d=++c;
		System.out.println(c); //c is incremented first and becomes 2
		System.out.println(d);//incremented from 1 to 2 and then assigned
		//prints 2,2
		
		int m=-97,n=m++;
		System.out.println(m);
		System.out.println(n);
		
		int f=-97,g=++f;
		System.out.println(f);
		System.out.println(g);
		
		//post decrement
		
		int t=2,u=t--;
		System.out.println(t);
		System.out.println(u);
		//prints 1,2-->t value decremented, u is first assigned initial value of t
		
		//pre decrement
		int p=2,q=--p;
		System.out.println(p);
		System.out.println(q);
		//prints 1,1
		
		int t1=200;
		System.out.println(t1++);
		System.out.println(t1++);
		//prints 200,201--> first print and then assign
		
		int t2=200;
		System.out.println(++t2);
		System.out.println(++t2);
		
		//prints 201 ,202-->increment first
			

	}

}
