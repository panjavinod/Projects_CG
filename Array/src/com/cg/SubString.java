package com.cg;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String a=sc.next();    
         // Sub Strings //    
       for(int i=0;i<a.length();i++) {
    	   for(int j=i;j<=a.length();j++) {
    		   for(int k=j;k<=j;k++) {
    			   System.out.print(a.substring(i, k)+" ");
    		   }
    		   System.out.println();
    	   }
    	  
       }
       
//       for(int i=0;i<a.length();i++) {
//    	   for(int j=i;j<a.length();j++) {
//    		   for(int k=i;k<=j;k++) {
//    			   System.out.print(a.charAt(k)+" ");
//    		   }
//    		   System.out.println();
//    	   }
////    	  
//       }
       
       // reverse of string
       char ch[]=a.toCharArray();
       String reverse="";
      for(int i=ch.length-1;i>=0;i--) {
    	  reverse+=ch[i];
      }
      System.out.println(reverse);
      
      String str="india is my country";
      int cnt=1;
      for(int i=0;i<str.length();i++) {
    	  if(str.charAt(i)==' ') {
    		  cnt++;
    	  }
      }
      System.out.println(cnt);
}

}
