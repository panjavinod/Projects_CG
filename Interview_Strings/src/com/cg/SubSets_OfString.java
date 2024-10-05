package com.cg;

public class SubSets_OfString {

	public static void main(String[] args) {
		String str="FUN";
		int len,temp=0;
		len=str.length();
		String[] newStr=new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				newStr[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		
		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]);
		}
		
//		System.out.println("Using internal--------------------------------------");
//		for(int i=0;i<str.length();i++) {
//			for(int j=i;j<str.length();j++) {
//				System.out.println(str.substring(i, j+1));
//			}
//		}
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
			
		}
		


	}

}
