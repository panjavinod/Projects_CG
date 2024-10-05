package com.cg;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		String str="abcabdabbd";
		char ch[]=str.toCharArray();
		String subString="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
				subString+=str.charAt(i);
			}
			
		}
		System.out.println(subString);
		
		

	}

}
