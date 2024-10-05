package com.cg;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<String> aa=new HashSet<String>();
       aa.add("one");
       aa.add("two");
       aa.add("three");
       aa.add("four");
       aa.add("four");
       aa.add(null);
       System.out.println("----------HashSet Doesnt maintain insertion order------------");
       Iterator itr=aa.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       HashSet<String> set1=new HashSet<String>();  
       set1.add("Ajay");  
       set1.add("Gaurav");  
       aa.addAll(set1);  
       System.out.println("----------to Add collection data -- addAll() method------------");
       for(String d:aa) {
    	   System.out.println(d);
       }
	}

}
