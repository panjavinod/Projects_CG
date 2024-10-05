package com.cg;

public class JavaCG {

	public static void main(String[] args) {
		String a="45689";  //output 11219
		
	 char[] ch=a.toCharArray();
	 String b="";
	 for(int i=0;i<a.length()-1;i++) {
		
			 b+=Math.abs(ch[i]-ch[i+1]);
		 
		 
	 }
	 
	 b+=ch[a.length()-1];
	 System.out.println(b);
		
	}

}
