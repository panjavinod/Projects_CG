package com.cg;

import java.io.IOException;

//Rule 1: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception.

//class Parent{   
//	  void msg() {  
//	    System.out.println("parent method");  
//	    }    
//	}   
//public class MethodOverRidingException extends Parent{
//	void msg() throws IOException {    
//	    System.out.println("TestExceptionChild");    
//	  }  
//	public static void main(String[] args) {
//	
//		Parent p = new MethodOverRidingException();    
//		   p.msg();    
//	}
//
//}

//Rule 2: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.

class Parent{    
	  void msg() {  
	    System.out.println("parent method");  
	  }    
	}    
	    
	public class MethodOverRidingException extends Parent{    
	  void msg()throws ArithmeticException {    
	    System.out.println("child method");    
	  }    
	  
	  public static void main(String args[]) {    
	   Parent p = new MethodOverRidingException();    
	   p.msg();    
	  }    
	}   




