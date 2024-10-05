package com.cg;

 class Over {
	public  void Over() {
		System.out.println("Hiii");	
	}
}

public class Overideingg extends Over {
	public  void Over() {
		super.Over();
		System.out.println("Hello");		
	}
	
	public static void main(String[]args) {
		Overideingg sc=new Overideingg();
		sc.Over();
		
	}
}
