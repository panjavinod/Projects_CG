package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Remove_ArrayList_Duplicate {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,4,5,6,7,2,1,1);
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println("Before Elements "+list);
		System.out.println("After Elements "+set);
		List<Integer> list1=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++) {
			if(!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}else {
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("Using For Loop "+list1);
		
//   ------------------------------------------------------------------------------
		
//		int count;
//		for(int i=0;i<list.size();i++) {
//			 count=1;
//			for(int j=i+1;j<list.size();j++) {
//				if(list.get(i)==list.get(j)) {
//					count++;
//					list.set(j, 0);
//				}
//			}
//			if (count > 0 && list.get(i) != 0) {
//	            System.out.println(list.get(i) + "=" + count);
//	        }
//		}
		

//   -------------------------------------------------------------------------------
		
//		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//		int count=0;
//		for(int i=0;i<list.size();i++) {
//			
//			for(int j=0;j<list.size();j++) {
//				if(list.get(i)==list.get(j)) {
//					count++;
//				}
//			}
//			map.put(list.get(i),count);
//			count=0;
//		}
//		
//		System.out.println(map);
//		
//
	}

}
