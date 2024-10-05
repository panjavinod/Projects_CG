package com.cg;
// class more power compare to interface and default methods have low periority and normal methods have high periority
 
interface Printable {  // we cant create a object for interface,its contains abstract methods 
	  void sum(int a,int b); //which are in complete still if you try to create object for interface
	    default void show() {       // its get compiletime error
	    	System.out.println("hii");
	    }
	    static void sin() {
	    	System.out.println("vinnu");
	    }
 }                             
 
 class a implements Printable{

		@Override
		public void sum(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("hello"+" "+(a+b));
		}
		
	}

public class Interface{
	public static void main(String[]args) {
		a aa=new a();
		aa.sum(5,10);
		aa.show();
		Printable.sin();//becaue static methods no need create objects we can call using class name
	   }
	}