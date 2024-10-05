package com.cg;

import java.util.Arrays;
import java.util.List;

public class E_java8 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("java","python","you","php","ab","super");
		int count=0;
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			if(str.length()>3) {
				count++;
			}
		}
		System.out.println("Count Strings whos length is Greaterthen 3 IS "+count);
		
		System.out.println("--------------Using Java 8 ----------------");
		long countt=list.stream().filter(i->(i.length()>3)).count();
		System.out.println("  Using Java 8  "+countt);
	}
	
	

}
