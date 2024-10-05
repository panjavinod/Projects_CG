package com.cg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class User {
	

public static void main(String args[]){  
//	  ArrayList<String> al=new ArrayList<>(); 
//	  LinkedList<String> al=new LinkedList<String>();
//	  HashSet<String> al=new HashSet(); 
	TreeSet<String> al=new TreeSet<String>(); 
//	LinkedHashSet<String> al=new LinkedHashSet();
	 // al.add(null);  
	  al.add("Bpple");  
	  al.add("Aanana");  
	  al.add("Grapes"); 
for(String fruit:al)    {
    System.out.println(fruit);
 }
}
}