package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo2 
{
	public static void main(String[] args)
	{
	    ArrayList al=new ArrayList();	
	    
	    //add information
	    al.add("kim");
	    al.add("taehyung");
	    al.add(30);
	    al.add(54.6f);
	    al.add("korean");
	    al.add(null);
	    
	    System.out.println(al);
	    
	    System.out.println("=======iterator curser==========");
	       Iterator itr=al.iterator();
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	       
	    System.out.println("======listiterator curser=========");
	       ListIterator litr=al.listIterator();
	       while(litr.hasNext())
	       {
	    	   System.out.println(litr.next());
	       }
	}

}
