package com.cg;
//class Outer{  // outer class 
//
//class Innner{   //member classes  == A class created within class and outside method.
//	
//}
//public static void display() {
//	
//	class Local{  // local classes 
//		
//	}
//	Consumer<Integer> aa=new Consumer<Integer>() { // annonymous class == A class created for implementing 
//		                                           // an interface or extending class. 
//		                                           // The java compiler decides its name.
//};
//}
//}
class Outer{
	int x=5;
	class Inner{
       public int myInnerMethod() {
        return x;
    }
		int y=10;
	}
}
//class OuterClass {
//	  int x = 10;
//
//	  static class InnerClass {
//	    int y = 5;
//	  }
//	}
public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer aa=new Outer();
		Outer.Inner bb=aa.new Inner();
		System.out.println(aa.x+bb.y);
		System.out.println(bb.myInnerMethod());
//		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//	    System.out.println(myInner.y);
	}

}


