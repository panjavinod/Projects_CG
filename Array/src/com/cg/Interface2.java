package com.cg;
interface Printablee{
	void sum(int a,int b); 
}
//class Add implements Printablee{
//
//	@Override
//	public void sum(int a, int b) {
//		// TODO Auto-generated method stub
//		System.out.println("hello"+" "+(a+b));
//	}
//	
//}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printablee aa = (a,b) -> {System.out.println(a+b);};
        aa.sum(5,5);
        
	}

}
