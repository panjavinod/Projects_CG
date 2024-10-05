package com.cg;

class parentt{
	public void message() {
		System.out.println("UP_Casting");
	}
}
class child extends parentt{
	public void message_One() {
		System.out.println("Down_Casting");
	}
	
}
public class UpCating_DownCasting {

	public static void main(String[] args) {
		parentt obj1= (parentt) new child(); //UP casting Going Child to parent
		parentt obj = new child();
		obj1.message();
		obj.message();
	
		//obj.message_One();  we ll get compile time error because parent class 
		                       //dont know the child methods
		
		child obj2=(child)obj1;  // Down Casting here we are not creating object of child we are using before child object
		obj2.message_One();
		obj2.message();
	}

}
