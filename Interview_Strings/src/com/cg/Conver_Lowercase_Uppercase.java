package com.cg;

public class Conver_Lowercase_Uppercase {

	public static void main(String[] args) {
		String str="Great Power";
		 StringBuffer newStr=new StringBuffer(str);    
		
		for(int i=0;i<str.length();i++) {
			
			    if(Character.isLowerCase(str.charAt(i))) {    
	                //Convert it into upper case using toUpperCase() function    
	                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
	            }    
	            //Checks for upper case character    
	            else if(Character.isUpperCase(str.charAt(i))) {    
	                //Convert it into upper case using toLowerCase() function    
	                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
	            }    
		}
		System.out.println(newStr);
		
		String name="vinodPANJA";
		String user="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isLowerCase(ch)) {
				user+=Character.toUpperCase(ch);
			}
			else {
				user+=Character.toLowerCase(ch);
			}
		}
		System.out.println(user);

	}

}
