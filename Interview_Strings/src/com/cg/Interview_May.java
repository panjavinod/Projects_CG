package com.cg;

import java.util.Scanner;

public class Interview_May {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName=sc.next();
		System.out.println("Enter the Second name");
		String secondName=sc.next();
		String password;
		if(firstName.length()>4 && secondName.length()>4) {
			password=firstName.substring(0, 4)+ secondName.substring(0, 4);
			System.out.println(password);
		}
		else if(firstName.length()<4 && secondName.length()>4){
			password=firstName.substring(0,firstName.length())+secondName.substring(0,(8-firstName.length()));
			System.out.println(password);
		}
		else if(firstName.length()>4 && secondName.length()<4){
			password=firstName.substring(0,(8-secondName.length()))+secondName.substring(0,secondName.length());
			System.out.println(password);
		}
		else {
			String first=firstName.substring(0);
			String second=secondName.substring(0);
			if(firstName.length()<4 && secondName.length()<4) {
			for(int i=0;i<4-firstName.length();i++) {
				first=first+"0";
			}
			for(int j=0;j<4-secondName.length();j++) {
				second=second+"1";
			}
		  }
			System.out.println(password=first+second);
		}
		

	}

}
