package com.cg;

public class NestedTry {

	public static void main(String[] args) {
		try {     
			          //inner try block 1
			   try{    
			     int b =39/0;    
			       }  
			        catch(ArithmeticException e)  
			       {  
			      System.out.println(e);  
			       } 
			          // inner try block 2
			   try{    
				    int a[]=new int[5];      
				     a[5]=4;    
				     }  
				    catch(ArrayIndexOutOfBoundsException e)  
				    {  
				       System.out.println(e);  
				    }    
			   
			
		}catch(Exception e) {
			System.out.println("handled the exception (outer catch)");  
		}
	}

}
