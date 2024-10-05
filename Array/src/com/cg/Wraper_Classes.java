package com.cg;

//The wrapper class in Java is  convert primitive into object and object into primitive.
public class Wraper_Classes {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		int a=10;
		Integer num=a;
		Integer num1= new Integer(a);
		
		// Boxing is converting int into Integer explicitly  
		System.out.println("Boxing "+num1);
		//Auto_boxing is automatic conversation of primitive to object
		System.out.println("Auto_Boxing "+num);
		
		Integer b=new Integer(3);
		int j=b;
		int i=b.intValue();
		//Boxing is converting Integer to int explicitly  
		System.out.println("Boxing "+i);
		//Un_boxing is automatic conversation of object to primitive
		System.out.println("Un_Boxing "+j);

	}

}
