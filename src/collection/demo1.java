package collection;

import java.util.ArrayList;

public class demo1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		//to add information
		al.add("Virat");         //index=0
		al.add(100);             //index=1
		al.add('A');               //index=2
		al.add(60.35f);         //index=3
		al.add(100);             //index=4
		al.add(null);             //index=5
		al.add(null);              //index=6
		System.out.println(al);
		
		//to verify arraylist is empty or not
		System.out.println(al.isEmpty());
		
		//for size or capacity
		System.out.println(al.size());
		
		//to add information in between arraylist    == right shift operator
		al.add(2,50);
		System.out.println(al);
		
		//to remove information from arraylist==left shift operator
		al.remove(2);
		System.out.println(al);
		
		//update information
		al.set(2,50.35);
		System.out.println(al);
		
		//to find of data
		System.out.println(al.indexOf(50.35));
		
		//to get index by providing data
		System.out.println(al.get(0));
		
	System.out.println("==============for each loop================");
	
	for(Object S1:al)
	{
		System.out.println(S1);
	}
	}

}
