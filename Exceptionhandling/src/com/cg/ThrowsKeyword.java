package com.cg;

import java.io.IOException;

//class M{
//	void method() throws IOException {
//		throw new IOException("device error");  
//	}
//}
//
//public class ThrowsKeyword {
//
//	public static void main(String[] args) {
//		M m=new M();
//		try {
//			m.method();
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//
//	}
//
//}

//In case we declare the exception, if exception does not occur, the code will be executed fine.

class M{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	}  
	class ThrowsKeyword{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	} 


//In case we declare the exception and the exception occurs, it will be thrown at runtime 
//because throws does not handle the exception.

//class M{  
//	 void method()throws IOException{  
//	  throw new IOException("device error");  
//	 }  
//	}  
//	class ThrowsKeyword{  
//	   public static void main(String args[])throws IOException{//declare exception  
//	     M m=new M();  
//	     m.method();  
//	  
//	    System.out.println("normal flow...");  
//	  }  
//	}  