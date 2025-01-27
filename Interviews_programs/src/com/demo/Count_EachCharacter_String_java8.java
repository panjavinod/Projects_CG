package com.demo;

import java.util.Map;
import java.util.stream.Collectors;

public class Count_EachCharacter_String_java8 {

	public static void main(String[] args) {
		
		String str = "aaabbbbcc";
		
        str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c ->c,Collectors.counting()))
           .forEach((k,v)-> System.out.println(k+"---"+v));
        
        System.out.println("===================================");
        
        Map<Object, Long> map= str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
        
        map.forEach((key,value)->System.out.println(key+"---"+value));
       
	}

}
