package Javasession;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //declare the type of integer array list-here Integer is a class and the below array list
		//takes in only int values
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		
		ArrayList<String> ar3 =new ArrayList<String>();
		ar3.add("apple");
		ar3.add("Orange");
		ar3.add("flour");
		
		for (String s:ar3) 
		{
			System.out.println(s);
		}
		System.out.println("_______________");
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Newbee");
		empData.add("SE");
		empData.add("Cyber");
		empData.add("33L");
		for (Object o:empData)
		{
			System.out.println(o);
		}
		
		/* 1. Write a Java program to create a new array list,
		 *  add some colors (string) and print out the collection*/
		System.out.println("_______________");
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		for (int i=0;i<colors.size();i++)
		{
         System.out.println(colors.get(i));
		}
		
		/* Write a Java program to insert an element into the array 
		 * list at the first and last positions.*/
		
		ArrayList <Integer> arr=new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		System.out.println("size is " +arr.size());
		System.out.println("adding elements to first and last indices");
		arr.add(0, 10);
		arr.add((arr.size()-1),250);
		System.out.println("size is " +arr.size());
		
		/*3. Write a Java program to retrieve an element 
		 * (at a specified index) from a given array list. */
		for (int o:arr)
		{
			System.out.println(o);
		}
		
		System.out.println("element at 2nd position is "+arr.get(1));
		
		
		/*4. Write a Java program
		 *  to update specific array element by given element. */
		
		arr.set(0, 0);
		System.out.println("Elements after update is");
		for (int o:arr)
		{
			System.out.println(o);
		}
		
		
		/*5. Write a Java program to
		 *  remove the third element from a array list. */
		System.out.println("Removing 3rd element from list");
		arr.remove(2);
		System.out.println("Elements after removing  is");
		for (int o:arr)
		{
			System.out.println(o);
		}
		
		/*6. Write a Java program to search an element in a array list.*/
		
		System.out.println("searching for efg in the array list");
		ArrayList<Object> names=new ArrayList<Object>();
		names.add("abc");
		names.add("efg");
		names.add("jkl");
		boolean present = names.contains("efg");
		if (present)
		{
			System.out.println("searched value is present");
		}
		else {System.out.println("value not present");}
		
		
		
		/* 7. Write a Java program to reverse elements in a array list*/
		
		ArrayList<Integer> arrL=new ArrayList <Integer>();
		arrL.add(10);
		arrL.add(9);
		arrL.add(8);
		arrL.add(7);
		arrL.add(6);
		arrL.add(5);
		arrL.add(4);
		arrL.add(3);
		arrL.add(2);
		arrL.add(1);
		
		System.out.println("Before reversal the values are");
		for (int i:arrL)
		{
			System.out.println(i);
		}
		
		
		System.out.println("After reversal the values are");
		for(int j=(arrL.size()-1);j>=0;j--)
		{
			System.out.println(arrL.get(j));
		}
		
		System.out.println("Before extraction the values are");
		for (int i:arrL)
		{
			System.out.println(i);
		}
		
		System.out.println("After extraction the values are");
		System.out.println(arrL.subList(3, 7));
		
		System.out.println("Before swapping the values are");
		for (int i:arrL)
		{
			System.out.println(i);
		}
		
		System.out.println("After swapping the values are");
		
		int i1=arrL.get(5);
		int i2=arrL.get(6);
		arrL.set(5, i2);
		arrL.set(6,i1);
		for (int i:arrL)
		{
			System.out.println(i);
		}
		
		ArrayList<String>st=new ArrayList<String>();
		System.out.println("Before removing all elements");
		
		st.add("a");
		st.add("b");
		st.add("c");
		for (String i:st)
		{
			System.out.println(i);
		}
		System.out.println("after removing all elements");
		st.removeAll(st);
		for (String i:st)
		{
			System.out.println(i);
		}
		ArrayList<String>st1=new ArrayList<String>();
		System.out.println("Before removing all elements");
		
		st1.add("a");
		st1.add("b");
		st1.add("c");
		System.out.println("Before trimming "+(10-st1.size()));
		st1.trimToSize();
		System.out.println("After trimming "+st1.size());
		
		System.out.println("printing by position");
		for(int i=0;i<st1.size();i++)
		{
			System.out.println("element at "+i+" is "+st1.get(i));
		}
	}

}
