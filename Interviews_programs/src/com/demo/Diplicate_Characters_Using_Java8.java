package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Diplicate_Characters_Using_Java8 {

	public static void main(String[] args) {
		String str="japan";
//		str.chars().forEach(i->System.out.println(i));
		str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()))
		   .forEach((k,v)->System.out.println(k+"--->"+v));
		
		
		Map<Object, Long> collect = str.chars().mapToObj(i->(char)i)
		           .collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(collect);
		
	}

}
