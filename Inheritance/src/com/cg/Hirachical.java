package com.cg;

public class Hirachical {
 public void a() {
	System.out.println("hii");
}
}
class B extends Hirachical{
  public void b() {
	  super.a();
	  System.out.println("hello");  
  }
}
class C extends B{
	public void c() {
	super.b();
		System.out.println("hello");  	
	}
}
class D extends C{
	public void d() {
		super.c();
		System.out.println("Welcome");
	}
	public static void main(String[]args) {
		D cc=new D();
		cc.d();
	}
}