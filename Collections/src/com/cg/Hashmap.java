package com.cg;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");
		   map.put(null, null);
		   map.put(5, null);
		   System.out.println("----------it may have one null key and multiple null values---------");
		   for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }
		   System.out.println();
		   System.out.println("----------update value using key----------");
		   map.replace(1, "Mangoo");
		   System.out.println(map); 
		   System.out.println();
		   System.out.println("----------get key using value ----------");
		   String value="Apple";
		   for(Map.Entry s:map.entrySet()) {
			   if(value==s.getValue()) {
				   System.out.println("The value of Key is "+s.getKey());
			   }
		   }
		   System.out.println();
		   System.out.println("----------Remove element from map  ----------");
		   System.out.println(map.remove(2));
		   System.out.println(map);
	}

}
