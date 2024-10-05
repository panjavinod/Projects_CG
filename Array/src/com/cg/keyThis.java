package com.cg;

public class keyThis {
	int price;
	String name;
	public keyThis() {
		System.out.println("helloo"); // 3 invoke the current class constructor
	}
	
	public keyThis(int price, String name) {
		this();
		this.price = price;// 1 refer the current class instance variable
		this.name = name;
	}
//	void dis() {
//		System.out.println("Hiiii");
//	}
	void display() {
//		this.dis();
		System.out.print("Name"+" "+name+"==" +"price"+" "+ price);
		// 2 invoke the current class method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     keyThis aa=new keyThis(100, "oil");
     aa.display();
	}

}
