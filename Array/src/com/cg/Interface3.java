package com.cg;

interface Sayable{  
    default void say() {  
        saySomething();  
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}  
public class Interface3  implements Sayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sayable s = new Interface3();  
	        s.say();  
	}
}
