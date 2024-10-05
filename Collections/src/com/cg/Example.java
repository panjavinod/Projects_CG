package com.cg;

import java.util.ArrayList;


public class Example {
	public ArrayList<Integer> display(ArrayList<Integer> b)
	{
		
		for(int i=0;i<b.size();i++)
		{
			if(b.get(i)%2!=0)
		  {
		   b.remove(i);
		   }
		  
		 }
		return b;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Example aa=new Example();
		aa.display(a);

		for(Integer j:a) {
			System.out.println(j);
		}
		
	}
}

	
