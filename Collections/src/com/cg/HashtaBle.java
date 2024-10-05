package com.cg;

import java.util.Hashtable;
import java.util.Map;

public class HashtaBle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul"); 
	     map.put(104, "hello");
	     for(Map.Entry m:map.entrySet()){  
	    	   System.out.println(m.getKey()+" "+m.getValue());  
	    	  }  
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));  
	     map.putIfAbsent(104,"Gaurav"); 
	     //It is used to insert a key-value pair into the map only if the specified key is not already present in the map, 
	     //or if the key is present but maps to a null value. 
	     //If the key is already present and maps to a non-null value, 
	     //the method will not update the existing value	     
	}

}
