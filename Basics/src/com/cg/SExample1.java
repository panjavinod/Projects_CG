package com.cg;

import java.util.Scanner;

public class SExample1 {
	public static String capitalizeWord(String str){  
//	    String words[]=str.split("\\s");  
	    String Str1="";  
	    for(int i=str.length()-1;i>=0;i--) {
	    	Str1+=str.charAt(i);
	    }
	    
	    return Str1.toUpperCase();  
	   
	}  
	
		
	public static void main(String[] args) {  
	    System.out.println(SExample1.capitalizeWord("my name is khan"));  
	    System.out.println(SExample1.capitalizeWord("I am sonoo jaiswal"));  
	    }

	//tOGGLE : yM eMAN sI nAHK ----> first element of string is lowercase 
                                  //remaining all elments are upper case
	
	//Ex:-
//	String first=sb.substring(0,1);  
//    String afterfirst=sb.substring(1);  
//    reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" "; 
}
