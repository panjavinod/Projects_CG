package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Whitefield3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Students Passed in the Exam: ");
		int TotalMembers=sc.nextInt();
	    List<Integer> list=new ArrayList<Integer>();
	    System.out.println("Enter "+TotalMembers+" records one by one");
	    for(int i=0;i<TotalMembers;i++) {
	    	list.add(sc.nextInt());
	    }
	    System.out.print("Enter the Roll Number to Search for: ");
	    int RollNumber=sc.nextInt();
	    boolean found = false;
	    for(int i=0;i<TotalMembers;i++) {
	    	if(list.get(i)== RollNumber) {
	    		System.out.println("Roll Number "+RollNumber+" Passed in the exam Rank is "+(i+1));
	            found=true;
	            break;
	    	}
	    }
	   if(!found) {
		   System.out.println("Roll Number " + RollNumber + " failed the exam");
	   }
	}

}
