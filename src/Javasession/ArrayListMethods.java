package Javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
	    System.out.println(num);
	    
	    
	    //print static array element without for loop
	    
	    int i[]= {10,20,30,40};
	    System.out.println(Arrays.toString(i));
	    
	    
	    //sorting array list
	    ArrayList<Integer> l1=new ArrayList<Integer>(Arrays.asList(80,20,30,40));
	    ArrayList<Integer> l2=new ArrayList<Integer>(Arrays.asList(40,30,20,40));
	    ArrayList<Integer> l3=new ArrayList<Integer>(Arrays.asList(20,40,30,90));
	    System.out.println("Before sorting " );
	    System.out.println(l1);
	    System.out.println("after sorting " );
	    Collections.sort(l1);
	    System.out.println(l1);
	    
	    System.out.println("--comparing--");
	    System.out.println(l1.equals(l3));
	    
	    System.out.println("removing common elements");
	    l1.removeAll(l2);
	    
	    
	    
	    
	}
	

}
