package com.cg;
class parent{
	public parent() {
		System.out.println("parent constructor");
	}
	public void details() {
		System.out.println("parent");
	}
}
class child extends parent{
	public child() {
		System.out.println("child cunstructor");
	}
	public void details() {
		System.out.println("child");
	}
}
public class inheritance {

	public static void main(String[] args) {
		
      parent a=new child();
      
      a.details();
     
	}

}
