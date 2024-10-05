package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenUsingJava8 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,20,40,30,90,56,78,36);
		List<Integer> li=list.stream().filter(i->i%2==0).toList();
		System.out.println(li);
		
		List<Integer> list_one=Arrays.asList(1,2,3,4,2,5,4);
		Set<Integer> set= new HashSet<Integer>();
		List<Integer> duplicates=list_one.stream().filter(i->!set.add(i)).toList();
		System.out.println(duplicates);
		
		
		
	}

}
