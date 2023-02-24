package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class demo3 
{
	public static void main(String[] args)
	{
		Vector V1=new Vector();
		
		//add informayion
		V1.add("Rohit");
		V1.add(120);
		V1.add('A');
		V1.add(30.25f);
		V1.add(120);
		V1.add(null);
		V1.add(null);
		System.out.println(V1);
		
		//to verify vector is empty or not
		System.out.println(V1.isEmpty());
		
		//size or capacity
		System.out.println(V1.size());
		
		//verify info is present or not
		System.out.println(V1.contains("Rohit"));
		
		//add info in between vector==right shift operator
		V1.add(4,150);
		System.out.println(V1);
		
		//remove information==left operator
		V1.remove(4);
		System.out.println(V1);
		
		//update info
		V1.set(3, 12.5f);
		System.out.println(V1);
		
		//to find index of data
		System.out.println(V1.indexOf('A'));
		
		//to get index by providing info
		System.out.println(V1.get(1));
		
		System.out.println("===========for each loop==============");
		for(Object S1:V1)
		{
			System.out.println(S1);
		}
		
		System.out.println("============iterator==================");
		Iterator itr =V1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==========listiterator===================");
		ListIterator litr=V1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("===============enumeration============");
	 Enumeration en=V1.elements();
	 while(en.hasMoreElements())
	 {
		 System.out.println(en.nextElement());
	 }
	}

}
