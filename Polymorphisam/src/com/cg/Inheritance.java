package com.cg;
class A{
	public void eat() {
		System.out.println("eating_one");
	}
}
class B extends A{
	public void eat() {
	
		System.out.println("eating");
	}
}
public class Inheritance {
	

	public static void main(String[] args) {
	 B name=new B();
	 name.eat();
	}

}
 


