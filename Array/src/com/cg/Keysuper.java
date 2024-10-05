package com.cg;

// 1 refer the immediate parent class instance variable
class parent{
	String name="panja";
	parent(){
		System.out.println("Welcome");
	}
	void dis() {
		System.out.println("Hii");
	}	
}
public class Keysuper extends parent {
	String name="vinnu";
	Keysuper(){  // 3 invoke the immediate parent class constructor
		
		super();
	}
	void display() {
		
		super.dis(); // 2 invoke the immediate parent class method
		System.out.print(name+" ");
		System.out.print(super.name);
	}

	public static void main(String[] args) {
		Keysuper aa=new Keysuper();
       aa.display();
	}

}
 
