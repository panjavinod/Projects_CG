package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers_ArrayList {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,30,20,10,40,60,20,90);
		System.out.println("----------------usig Set------------------");
		Set<Integer> duplicate=new HashSet<>(numbers);
		System.out.println(duplicate);
		System.out.println("----------------usig List------------------");
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<numbers.size();i++){
			if(!list.contains(numbers.get(i))) {
				list.add(numbers.get(i));
			}
		}
		System.out.println(list);

		int min=Collections.min(numbers);
		System.out.println("Minimum number of list "+min);
	}
}
