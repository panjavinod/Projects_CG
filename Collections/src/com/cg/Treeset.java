package com.cg;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   TreeSet<String> ts=new TreeSet<String>();
	   ts.add("Ravi");  
	   ts.add("Vijay");  
	   ts.add("Ravi");  
	   ts.add("Arjun");
	   ts.add("car");
	    //ts.add(null);  
	   //Traversing elements  
	   System.out.println("-----------------TreeSet maintain Assending order----------------");
	   Iterator<String> itr=ts.iterator();  
	   while(itr.hasNext()){  
	    System.out.println(itr.next());  
	   }  
	   System.out.println("-----------------TreeSet maintain descending order----------------");
	   Iterator i=ts.descendingIterator();  
       while(i.hasNext())  
       {  
           System.out.println(i.next());  
       }  
       System.out.println("-------------- remove the highest and lowest Value ----------------");
       System.out.println("Lowest Value: "+ts.pollFirst());    
       System.out.println("Highest Value: "+ts.pollLast());  
       System.out.println("Head Set: "+ts.headSet("vijay"));
       System.out.println("TailSet: "+ts.tailSet("Ravi"));  
	}
	
	
}
