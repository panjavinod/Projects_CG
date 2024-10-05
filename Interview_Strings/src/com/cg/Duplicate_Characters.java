package com.cg;

import java.util.Arrays;
import java.util.HashMap;

public class Duplicate_Characters {

	public static void main(String[] args) {
//		String a = "javajava";
//
//		char ch[] = a.toCharArray();
//		int count;
//		for (int i = 0; i < ch.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					count++;
//					ch[j] = '0';
//				}
//			}
//			if (count > 1 && ch[i] != '0') {
//				System.out.println(ch[i] + "=" + count);
//			}
//		}
		
		 String a = "javajava";
	     char ch[] = a.toCharArray();
	     Arrays.sort(ch);
         int count = 1;
	        for (int i = 0; i < ch.length - 1; i++) {
	            if (ch[i] == ch[i + 1]) {
	                count++;
	            } else {
	                if (count > 1) {
	                    System.out.println(ch[i] + "=" + count);
	                }
	                count = 1;
	            }
	        }
	        // Check the last character
	        if (count > 1) {
	            System.out.println(ch[ch.length - 1] + "=" + count);
	        }

		       
//		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
//		for(char c:ch) {
//			if(!hm.containsKey(c)) {
//				hm.put(c, 1);
//			}else {
//		Integer count=		hm.get(c);
//		hm.put(c, count+1);
//			}
//		}
//		System.out.println(hm);
	}

}
