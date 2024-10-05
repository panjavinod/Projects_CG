package com.cg;

interface Draw{
	void print( int i);
}
//class Xyz implements Draw{
//
//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("Good morning");
//	}
//	
//}

public class LambdaExpressions {

//	public static void main(String[] args) {
//		// annonymous //class Draw a=new Draw() {                     // replacement of Xyz class
//			public void print() {
//				System.out.println("good morning");
//			}
//		};
//		a.print();
//	}
	public static void main(String[] args) {
		Draw a=i -> System.out.println("good morning "+i);
		a.print(6);
	}

}
