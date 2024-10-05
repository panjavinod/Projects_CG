package com.cg;

import java.util.Arrays;
import java.util.List;
//Find the numbers starting with 1
public class FindNumbersStartingWith1 {
	
	public static void main(String[]args) {
		List<Integer>list = Arrays.asList(10, 12, 32, 14, 18, 25, 65);
		for(int i=0;i<list.size();i++) {
			String s=String.valueOf(list.get(i));
			if(s.startsWith("1")) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("Using JAVA 8 ");
		list.stream().map(s->s+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
	}
	

}
