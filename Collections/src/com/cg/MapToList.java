package com.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(1,"java");
		a.put(2, "apple");
		List<Integer>l1=new ArrayList(a.keySet());
		List<String> l2 = new ArrayList(a.values());
		System.out.println(l1);
		System.out.println(l2);
		
	}

}
