package com.cg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EUsingjava8 {

	public static void main(String[] args) {
		String array[]= {"8","6","0","4","6","4","2","7"};
//		String str="";
//		Arrays.sort(array);
//				for(int i=array.length-1;i>=0;i--) {
//			str+=array[i];
//		}
//		System.out.println(str);
		String str=Arrays.stream(array).sorted((o1,o2)->o2.compareTo(o1)).reduce("",(s1,s2)->s1+s2);
		System.out.println(str);
		
		int array_one[]= {5,5,5,5};
		int total=Arrays.stream(array_one).reduce(0,(s1,s2)->s1+s2);
		System.out.println(total);
		
		}

}
