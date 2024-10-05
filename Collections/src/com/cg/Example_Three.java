package com.cg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example_Three {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		String str = "This this is is done by Saket Saket";
		String[] split=str.split(" ");
		for(int i=0;i<split.length;i++) {
			if(map.containsKey(split[i])) {
				int count=map.get(split[i]);
				map.put(split[i],count+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
      Iterator itr=map.entrySet().iterator();
      while(itr.hasNext()) {
    	  Map.Entry me = (Map.Entry) itr.next();
    	  System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
      }
      
	}

}
