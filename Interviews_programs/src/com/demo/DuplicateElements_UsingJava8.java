package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements_UsingJava8 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,50,10,30,20,40,20);
//		Set<Integer> DuplicateNumbers=numbers.stream().filter(i->Collections.frequency(numbers, i)>1)
//		            .collect(Collectors.toSet());
//		System.out.println(DuplicateNumbers);
		
		         numbers.stream()
				.collect(Collectors.groupingBy(i->i,Collectors.counting()))
				.entrySet().stream().filter(i->i.getValue()>1).forEach(entry -> System.out.println(entry.getKey()));
		
		Set<Integer> dupElements=new HashSet<Integer>();
		Set<Integer> DuplicateNumbers=numbers.stream().filter(i-> !dupElements.add(i))
	            .collect(Collectors.toSet());
	    System.out.println(DuplicateNumbers);
	}

}
