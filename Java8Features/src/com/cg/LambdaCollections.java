package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaCollections {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("vinod");
		list.add("apple");
		list.add("hunuman");
		Collections.sort(list,(l1,l2)->{
			return l1.compareTo(l2);
		});
		 for(String p:list){  
	            System.out.println(p);  
	        }  
		 
		 // using foreach loop
		 list.forEach((a)->System.out.println(a));

	}

}