package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Diplicate_Characters_Using_Java8 {

	public static void main(String[] args) {
String str="alakananda";
		
		Map<Character, Long> collect = str.chars().mapToObj(i->(char)i)
		           .collect(Collectors.groupingBy(i->i, Collectors.counting()));
		
		System.out.println(collect);
		
		System.out.println("-----------Duplicate Characters---------------");
		collect.entrySet().stream().filter(entry -> entry.getValue()>1)
		 .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times"));
		
		System.out.println("-----------NoRepated  Characters---------------");
		
		collect.entrySet().stream().filter(entry -> entry.getValue()==1).forEach(entry -> System.out.println(entry.getKey()));
		
	}

}
