package com.cg;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortTheMapUsingKey_Value {

	public static void main(String[] args) {
		Map<String,Integer> unsortedMap=new HashMap<String,Integer>();
		unsortedMap.put("Apple",5);
		unsortedMap.put("Banana", 2);
        unsortedMap.put("Orange", 8);
        unsortedMap.put("Mango", 3);
        
// indicates  that we are working with a list that contains key-value pairs represented by Map.Entry objects. 
        //Map.Entry is a inner interface of map
        List<Map.Entry<String,Integer>> entryList= new ArrayList<>(unsortedMap.entrySet());
        	
      // entryList.sort(Map.Entry.comparingByKey());
        entryList.sort(Map.Entry.comparingByValue());
        
//        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        Map<String,Integer> sortedMap=new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer> entry:entryList) {
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        
        
        for(Map.Entry<String,Integer> entry:sortedMap.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }

	}

}
