package com.cg;

import java.util.HashMap;
import java.util.Map;

public class Example_Seven {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>(4);
		map.put("Aman", 19);  
		map.put("Sunny", 29);  
		map.put("Ritesh", 39); 
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" Hash code is "+m.getKey().hashCode());
			int Index = m.getKey().hashCode()%4;
			System.out.println("INDEX OF "+m.getKey()+" IS "+Index);
			System.out.println(m.getValue()+" Hash code is "+m.getValue().hashCode());
			System.out.println();
		}
		
		// HashMap is a part of the Java collection framework. It uses a technique called Hashing.
		// Hasing- converts object to int it helps for faster searching
		// It uses an array and LinkedList data structure internally for storing Key and Value.
		// Hash map default size is 16
		// This gives a HashMap a size of 128 bytes when it is completely empty.
		// The maximum allowed size of a key is 512 MB.
		
		// in side put method we have hash method this hash method takes key parameter
		
		// node --  key , value , hash , next
	}

}
