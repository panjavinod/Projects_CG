package com.cg;

interface Addable{  
    int add(int a,int b);  
}  
public class Lambda {
           
	public static void main(String[] args) {
		// using without lambda
		Addable ad=new Addable() {

			@Override
			public int add(int a, int b) {
				
				return (a+b);
			}
			
		};
		// using lambda 
		Addable ad1=(int a,int b)->{
			return (a+b);
		};
		System.out.println("addition is "+ ad.add(5, 5));
		System.out.println("addition one  is "+ ad1.add(5, 5));
	}

}
