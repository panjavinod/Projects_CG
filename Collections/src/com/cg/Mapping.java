package com.cg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapping {
	 public static void main(String args[]){  
//		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
//		 Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		   map.put(2,"Mangoo");  //Put elements in Map  
		   map.put(1,"Apple");    
		   map.put(3,"Banana");   
//		   map.put(null,"Grapes"); //trying duplicate key  
//		   map.put(4,null);  
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}  
}
