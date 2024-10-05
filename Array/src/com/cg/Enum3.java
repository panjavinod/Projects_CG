package com.cg;

import java.util.ArrayList;

public class Enum3 {

	enum Gender{
		MALE,
		FEMALE,
		MALE1,
		FEMALE2
	}
	public static void main(String[] args) {
		ArrayList<Gender>list=new ArrayList<Gender>();
		for(Gender a:Gender.values()) {
			list.add(a);
		}
		System.out.println(list);
	
	}

}
