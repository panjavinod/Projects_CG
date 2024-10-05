package com.cg;

import java.util.ArrayList;
import java.util.List;

public class Example_Two {
	public boolean Validate(String s) {
		List<Character> lchar=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='}') {
				
			}else if(ch==')') {
				
			}else if(ch==']') {
				
			}
			else {
				lchar.add(ch);
			}
			for(int j=0;j<lchar.size();j++) {
				if(ch=='}') {
					if(lchar.get(j)=='{') {
						lchar.remove(j);
					}else {
						return false;
					}
					
				}else if(ch==')') {
					if(lchar.get(j)=='(') {
						lchar.remove(j);
					}else {
						return false;
					}
				}else if(ch==']') {
					if(lchar.get(j)=='[') {
						lchar.remove(j);
					}else {
						lchar.add('[');
						return false;
					}
				}
			}
			
		}
		if(lchar.size()==0) {
			return true;
		}
		
		
		//System.out.println(lchar.size());
		//System.out.println(lchar);
		
		return false;
		
	}

	public static void main(String[] args) {
		String s="(){}[";
		Example_Two two=new Example_Two();
	    boolean validate=two.Validate(s);
	    System.out.println(s);
		System.out.println(validate);
	}

}
