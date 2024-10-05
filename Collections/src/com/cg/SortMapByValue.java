package com.cg;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue {

	public static void main(String[] args) {
		LinkedHashMap<String, String> capitals = new LinkedHashMap();
	    capitals.put("Nepal", "Kathmandu");
	    capitals.put("India", "New Delhi");
	    capitals.put("United States", "Washington");
	    capitals.put("England", "London");
	    capitals.put("Australia", "Canberra");
	    System.out.println("----------------------------Unsorted---------------------");
	    for(Map.Entry entry:capitals.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());

	    }
	    
	    System.out.println("----------------------------sorted by vales---------------------");
	    Map<String, String> result = sortMap(capitals);
	    
	    for(Map.Entry entry:result.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());

	    }
	}

	public static LinkedHashMap sortMap(LinkedHashMap map) {
		List <Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
	 Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

		// call the sort() method of Collections
	   LinkedHashMap<String, String> result = new LinkedHashMap();

	    // get entry from list to the map
	    for (Map.Entry<String, String> entry : capitalList) {
	      result.put(entry.getKey(), entry.getValue());
	    }
		return result;
	}

}
