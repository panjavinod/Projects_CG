package com.cg;

public class NewInstance_Class {

	 
	//Using newInstance() Method of Class class
	
		String str="hello";  
		public static void main(String args[])  
		 {  
		try  
		{  
		//creating object of class  
			NewInstance_Class obj= NewInstance_Class.class.newInstance();   
		System.out.println(obj.str);          
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		}  
        
        

}
