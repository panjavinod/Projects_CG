package com.cg;

import java.util.HashMap;
import java.util.Map;

public class Add_String_Array_Duplicates_toMap {

	public static void main(String[] args) {
		String string="aabbddcjjkskjorecwbbocisbewvfb";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<string.length();i++) {
			int count =1;
			for(int j=i+1;j<string.length();j++) {
				if(string.charAt(i)==string.charAt(j)) {
					count++;
					char[] ch=string.toCharArray();
					ch[j]='0';
					string=String.valueOf(ch);
					
				}
				if(count>1 && string.charAt(i)!='0') {
					map.put(string.charAt(i), count);
				}
			}
			
		}
		System.out.println(map);
		
		char[] array=new char[] {'a','a','b','a','a','b','c'};
		Map<Character,Integer> mapp=new HashMap<Character,Integer>();
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					array[j]='0';
				}
			}
			if(count>1 && array[i]!='0') {
				mapp.put(array[i], count);
			}
			
		}
		System.out.println(mapp);

	}

}
