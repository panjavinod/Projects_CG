package com.cg;

import java.util.Arrays;

public class FirstNonRepeated_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="stress";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count =0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(count==0 && ch[i]!=0) {
				System.out.println("Find First Non Repeated Character in a String ----- "+ch[i]);
				break;
			}
			
		}

	}

}
